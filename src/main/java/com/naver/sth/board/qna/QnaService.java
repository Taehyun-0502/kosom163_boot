package com.naver.sth.board.qna;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.naver.sth.page.Pager;

@Service
public class QnaService {
	
	@Autowired
	private QnaMapper qnaMapper;

	public List<QnaDTO> list (Pager pager)throws Exception {
		
		pager.makePageNumber(qnaMapper.getCount(pager));
	 	
		return qnaMapper.list(pager);
		
		
	}
}
