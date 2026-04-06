package com.naver.sth.departments;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.GetMapping;

@Repository
public class DepartmentDAO {
	
	
	
	public ArrayList<DepartmentDTO> list() throws Exception  {
		System.out.println("DAO lsit");
		ArrayList<DepartmentDTO> ar= new ArrayList<>();
		
		Connection con = null;
		
		String sql="""
				SELECT * FROM TB_DEPARTMENT
				""";
		
		PreparedStatement st= con.prepareStatement(sql);
		
		ResultSet rs= st.executeQuery();
		
		while(rs.next()) {
			DepartmentDTO dto = new DepartmentDTO();
			dto.setDepartmentNo(rs.getString("DEPARTMENT_NO"));
			dto.setDepartmentName(rs.getString("DEPARTMENT_NAME"));
			dto.setCategory(rs.getString("CATEGORY"));
			dto.setOpenYn(rs.getString("OPEN_YN"));
			dto.setCapacity(rs.getLong("CAPACITY"));
			
			ar.add(dto);			
	
			
		}
		rs.close();
		st.close();
		con.close();
		
		return ar;
		
		
		
		
	}
	
	
}
