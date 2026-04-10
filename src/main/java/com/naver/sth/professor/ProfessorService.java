package com.naver.sth.professor;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.naver.sth.page.Pager;

@Service
public class ProfessorService {
		
		@Autowired
		private ProfessorDAO professorDAO;
		
		
		public List<ProfessorDTO> list(Pager pager)throws Exception{
			
			Map<String, Long> map =new HashMap<>();
			
			
			pager.makePageNumber(professorDAO.getCount());
			pager.makeRowNumber();
			
			return this.professorDAO.list(pager);
			
			
			 
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
