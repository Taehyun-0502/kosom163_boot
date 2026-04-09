package com.naver.sth.board.notice;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface NoticeMapper {

	public List<NoticeDTO> list () throws Exception;
	
	public NoticeDTO detail() throws Exception;
	
	public int create(NoticeDTO noticeDTO) throws Exception;
	
	public int update(NoticeDTO noticeDTO) throws Exception;
	
	public int delete(NoticeDTO noticeDTO)throws Exception;
	
	
	
}
