package com.naver.sth.member;

import java.time.LocalDate;

import lombok.AllArgsConstructor;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@AllArgsConstructor

public class MemberDTO {
	
	private String name;
	private Integer age;
	private LocalDate birth;
	private String[] num;
	
	
	
	
	
}
