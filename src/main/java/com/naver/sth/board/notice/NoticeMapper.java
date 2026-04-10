package com.naver.sth.board.notice;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import com.naver.sth.page.Pager;

@Mapper
public interface NoticeMapper {

	public List<NoticeDTO> list (Pager pager) throws Exception;
	
	public NoticeDTO detail() throws Exception;
	
	public int create(NoticeDTO noticeDTO) throws Exception;
	
	public int update(NoticeDTO noticeDTO) throws Exception;
	
	public int delete(NoticeDTO noticeDTO)throws Exception;
	
	public Long getCount()throws Exception;
	
}
