package com.naver.sth.departments;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.GetMapping;

@Repository
public class DepartmentDAO {
	
	@Autowired
	private SqlSession session;
	
	public List<DepartmentDTO> list() throws Exception  {
		System.out.println("DAO lsit");
		
		return session.selectList("com.naver.sth.departments.DepartmentDAO.list");
		
		
		
		
		 
	}
	
	
}
