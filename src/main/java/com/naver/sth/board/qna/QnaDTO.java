package com.naver.sth.board.qna;

import java.util.List;

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
	private List<QnaFileDTO>list;
	
}
