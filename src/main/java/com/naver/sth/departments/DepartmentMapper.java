package com.naver.sth.departments;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.naver.sth.page.Pager;

@Mapper
public interface DepartmentMapper {
	
	//list 
	public abstract List<DepartmentDTO> list(Pager pager)throws Exception;
	
	//detail
	public DepartmentDTO detail(DepartmentDTO departmentDTO)throws Exception;
	
	//create
	int create(DepartmentDTO departmentDTO)throws Exception; 
	
	//update
	int update(DepartmentDTO departmentDTO)throws Exception;
	
	//delete
	public abstract int delete(DepartmentDTO departmentDTO)throws Exception;
	
	public Long getCount(Pager pager)throws Exception;
}
