package com.naver.sth.board.notice;

import com.naver.sth.files.FileDTO;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
public class NoticeFileDTO extends FileDTO {

	private Long commentNo;
}
