package com.naver.sth.board.qna;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest

class QnaMapperTest {
	
	@Autowired
	private QnaMapper qnaMapper;
	@Test
	void testCreate() throws Exception {
		QnaDTO qnaDTO =new QnaDTO();
		qnaDTO.setTitle("답글2");
		qnaDTO.setContents("답글내용2");
	qnaDTO.setProfessorNo("작성자");
		qnaDTO.setRef(213L);
		qnaDTO.setStep(2L);
		qnaDTO.setDepth(2L);
		int result = qnaMapper.create(qnaDTO);
		assertEquals(1, result);
		
	}

}
