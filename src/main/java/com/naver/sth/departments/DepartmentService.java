package com.naver.sth.departments;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DepartmentService {
	
	@Autowired
	private DepartmentDAO departmentDAO;
	
	
	public ArrayList<DepartmentDTO>  lsit () throws Exception {
		
		System.out.println("Service list");
		
		ArrayList<DepartmentDTO> ar = this.departmentDAO.list();
		
		return ar;
	}
	
	
	
	
}
