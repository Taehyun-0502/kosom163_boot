package com.naver.sth.departments;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class DepartmentDAO {
	
	@Autowired
	private SqlSession session;
	private final String NAMESPACE="com.naver.sth.departments.DepartmentDAO.";
	
	//어느 namespace의 어떤 id를 가진 쿼리 태그를 실행 할 것 이가
	public List<DepartmentDTO> list () {
		//사용하려는 mapper의 namespace.id명을 적는다
		return session.selectList(NAMESPACE+"list");
		
		
	}
	public int create(DepartmentDTO departmentDTO) {
		return session.insert(NAMESPACE+"create", departmentDTO);
		
		
		
	}
	public int update(DepartmentDTO departmentDTO) {
		return session.update(NAMESPACE+"update",departmentDTO);
		
	}
	public DepartmentDTO detail(String num) {
		return session.selectOne(NAMESPACE+"detail",num);
		
	}
	public int delete(DepartmentDTO departmentDTO) {
		return session.delete(NAMESPACE+"delete",departmentDTO);
		
	}
	

}
