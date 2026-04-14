package com.naver.sth.board;

import java.time.LocalDateTime;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;


@Getter
@Setter
@ToString
public class BoardDTO {

	private Long commentNo;
	private String title;
	private String contents;
	private LocalDateTime toDate;
	private Long views;
	private String professorNo;
}
