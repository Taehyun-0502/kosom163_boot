package com.naver.sth.board.notice;


import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString 
public class NoticeDTO {
	
	private Long commentNo;
	private String title;
	private String contents;
	private LocalDateTime toDate;
	private Long views;
	private String professorNo;
	
	private List<NoticeFileDTO> list;

}
