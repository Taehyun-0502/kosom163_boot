package com.naver.sth.board.qna;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.naver.sth.page.Pager;

@Mapper
public interface QnaMapper {

		public List<QnaDTO> list(Pager pager)throws Exception;
		
		public Long getCount(Pager pager)throws Exception;
		
		public int create(QnaDTO qnaDTO)throws Exception;
		
		public int fileCreate(QnaFileDTO qnaFileDTO)throws Exception ;
		
		public QnaDTO detail(QnaDTO qnaDTO)throws Exception;
		
		public int replyUpdate(QnaDTO qnaDTO)throws Exception;
		
		
		
		
		
		
}
