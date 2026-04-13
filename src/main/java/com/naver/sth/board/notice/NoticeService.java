package com.naver.sth.board.notice;

import java.io.File;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.naver.sth.page.Pager;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class NoticeService {
	
	@Autowired
	private NoticeMapper noticeMapper; 
	@Value("${app.upload.base}")
	private String filePath;
	
	
	public List<NoticeDTO> list (Pager pager)throws Exception{
		
		pager.makePageNumber(noticeMapper.getCount(pager));
		
		return noticeMapper.list(pager);
		
	}
	
			
	
	
	
	public int create(NoticeDTO noticeDTO, MultipartFile attach) throws Exception{
		//1. 어디에 저장 할 것이가
		log.info(filePath);
		String filePath = this.filePath+"notice";
		
		//2. 어떤 이름으로 저장 할 것인가
		String fileName =UUID.randomUUID().toString(); 
//		log.warn(fileName);
//		
//		//3. 확장자는 어떻게 할 것 인가 
//		log.error(attach.getOriginalFilename());
//		String f= attach.getOriginalFilename();
//		f=f.substring(f.lastIndexOf("."));
//		log.info(f);
		fileName= fileName+"_"+attach.getOriginalFilename();
	
		//4 저장
		File file = new File(filePath);
		if(!file.exists()) {
			file.mkdirs();			
		}
		
		file =new File(file,fileName);
		//파일 저장
		attach.transferTo(file);
		
		
		
		return 0; //noticeMapper.create(noticeDTO);
	
		
	}
	public NoticeDTO detail(NoticeDTO noticeDTO)throws Exception{
			
		
		return noticeMapper.detail(noticeDTO);
	}
	
	
	
}
