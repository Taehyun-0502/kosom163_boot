package com.naver.sth.professor;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ProfessorDAOTest {
	@Autowired
	private ProfessorDAO professorDAO;	
	
	//@Test
	void testList() throws Exception{
		List<ProfessorDTO> ar=professorDAO.list();
		assertNotEquals(0, ar.size());
	}

	//@Test
	void testDetail() throws Exception{
		ProfessorDTO professorDTO = new ProfessorDTO();
        professorDTO.setProfessorNo("P001");
		
		professorDTO =professorDAO.detail(professorDTO);
        
		assertNotNull(professorDTO);
        
        
	}

	//@Test
	void testCreate() throws Exception {
		ProfessorDTO professorDTO = new ProfessorDTO();
		professorDTO.setProfessorNo("P201");
		professorDTO.setProfessorName("태현");
		professorDTO.setProfessorSsn("010101-1234567");
		professorDTO.setProfessorAddress("경기도 화성시 남양읍");
		professorDTO.setDepartmentNo("034");
		int result =professorDAO.create(professorDTO);
		assertEquals(1, result);
	}

	//@Test
	void testUpdate() throws Exception{
		ProfessorDTO professorDTO= new ProfessorDTO();
		professorDTO.setProfessorNo("P201");
		professorDTO.setProfessorName("송태현");
		professorDTO.setProfessorSsn("010101-1234567");
		professorDTO.setProfessorAddress("경기도 화성시 ");
		professorDTO.setDepartmentNo("034");
		
		int result =professorDAO.update(professorDTO);
		
		assertEquals(1, result);
	}

	//@Test
	void testDelete() throws Exception{
		ProfessorDTO professorDTO= new ProfessorDTO();
		professorDTO.setProfessorNo("P201");
		int result = professorDAO.delete(professorDTO);
		
		assertEquals(1, result);

	}

}
