package com.naver.sth.board.notice;

import static org.junit.jupiter.api.Assertions.*;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.log;

import java.util.List;
import java.util.Map;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import lombok.extern.log4j.Log4j2;
import lombok.extern.slf4j.Slf4j;





@SpringBootTest
@Slf4j
class NoticeMapperTest {
		@Autowired
		private NoticeMapper noticeMapper;
	//@Test
	/*
	 * void listTest() throws Exception{ List<NoticeDTO> ar =noticeMapper.list();
	 * assertNotEquals(0, ar.size()); }
	 */
		//@Test
	/*	void getCountTest()throws Exception{
			Long a = noticeMapper.getCount();
			assertNotEquals(0,a);
}
	*/
	
	 @Test 
	 void detailTest()throws Exception{ 
		 NoticeDTO dto = new NoticeDTO();
	 	dto.setCommentNo(176L); 
	 	dto =noticeMapper.detail(dto);
	 	log.info("Map : {}", dto);
	 	assertNotNull(dto);
	
	}
	
		
		
		
}
