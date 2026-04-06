package com.naver.sth.departments;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DepartmentService {
	
	@Autowired
	private DepartmentDAO departmentDAO;
	
	
	public List<DepartmentDTO>  lsit () throws Exception {
		
		System.out.println("Service list");
		
		List<DepartmentDTO> ar = this.departmentDAO.list();
		
		return ar;
	}
	
	
	
	
}
