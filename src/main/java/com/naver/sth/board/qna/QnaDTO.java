package com.naver.sth.board.qna;

import com.naver.sth.board.BoardDTO;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;


@Getter
@Setter
@ToString
public class QnaDTO extends BoardDTO {

	private Long ref;
	private Long step;
	private Long depth;
	
}
