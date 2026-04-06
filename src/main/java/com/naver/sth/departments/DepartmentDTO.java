package com.naver.sth.departments;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
@Setter
@Getter
public class DepartmentDTO {

	private String departmentNo;
	private String departmentName;
	private String category;
	private String openYn;
	private Long capacity;
	
	
}
