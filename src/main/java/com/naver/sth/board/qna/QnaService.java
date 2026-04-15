package com.naver.sth.board.qna;

import java.io.File;
import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.naver.sth.board.notice.NoticeFileDTO;
import com.naver.sth.page.Pager;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class QnaService {
	
	@Autowired
	private QnaMapper qnaMapper;
	@Value("${app.upload.base}")
	private String filePath;
	@Value("${app.board.notice}")
	private String notice;
	
	public List<QnaDTO> list (Pager pager)throws Exception {
		
		pager.makePageNumber(qnaMapper.getCount(pager));
	 	
		return qnaMapper.list(pager);
		
		
	}
	public int create(QnaDTO qnaDTO, MultipartFile[] attach)throws Exception{
		
		int result= qnaMapper.create(qnaDTO);
		
		log.info(filePath);
		String filePath=this.filePath+this.notice;
		
		if(attach == null) {
			return result;
			
		}
		for(MultipartFile m:attach) {
			
			if(m.isEmpty()) {
				
				continue;
			}
			String fileName=UUID.randomUUID().toString();
			
			fileName=fileName+"_"+m.getOriginalFilename();
			
			
			File file = new File(filePath);
			
			if(!file.exists()) {
				file.mkdirs();
				
			}
			file = new File(file,fileName);
			m.transferTo(file);
			
			QnaFileDTO qnaFileDTO= new QnaFileDTO();
			 qnaFileDTO.setFileName(fileName);
			 qnaFileDTO.setOriName(m.getOriginalFilename());
			 qnaFileDTO.setCommentNo(qnaDTO.getCommentNo());
			result=qnaMapper.fileCreate(qnaFileDTO);
			
			
		}
		
		return result;
	}
	public QnaDTO detail(QnaDTO qnaDTO) throws Exception{
		
		return qnaMapper.detail(qnaDTO);
		
	}
	
	public int replyCreate(QnaDTO qnaDTO) throws Exception{
		QnaDTO parent = qnaMapper.detail(qnaDTO);
		
		
		//답글의 ref step depth
		qnaDTO.setRef(parent.getRef());
		qnaDTO.setStep(parent.getStep()+1);
		qnaDTO.setDepth(parent.getDepth()+1);
		
		int result= qnaMapper.replyUpdate(parent);
		
		result = qnaMapper.create(qnaDTO);
			return result;
	}
	
	
	
	
	
	
	
	
	
}
