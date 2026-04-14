package com.naver.sth.board.notice;


import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

import com.naver.sth.board.BoardDTO;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString 
public class NoticeDTO extends BoardDTO {
	
	
	
	private List<NoticeFileDTO> list;

}
