package com.naver.sth.professor;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProfessorService {
		
		@Autowired
		private ProfessorDAO professorDAO;
		
		public List<ProfessorDTO> list()throws Exception{
			
			return this.professorDAO.list();
			
			 
		}
		public ProfessorDTO detail(ProfessorDTO professorDTO) throws Exception {
			
		    return professorDAO.detail(professorDTO);
		}
		
		public int create(ProfessorDTO professorDTO) throws Exception {
			return professorDAO.create(professorDTO);
			
		}
		public int update(ProfessorDTO professorDTO) throws Exception{
			
			return professorDAO.update(professorDTO);
		}
		
		
		public int delete(ProfessorDTO professorDTO) throws Exception{
			return professorDAO.delete(professorDTO);
			
		}
}
