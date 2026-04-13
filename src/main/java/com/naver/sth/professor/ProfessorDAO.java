package com.naver.sth.professor;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import com.naver.sth.page.Pager;

@Mapper
public interface ProfessorDAO {

	// 전체 조회
		public List<ProfessorDTO> list(Pager pager)throws Exception;
		
		// 디테일 조회
		public ProfessorDTO detail(ProfessorDTO profrssorDTO)throws Exception;
		
		// 교수 추가
		public int create(ProfessorDTO profrssorDTO)throws Exception;
		
		// 교수 정보 수정
		public int update(ProfessorDTO profrssorDTO)throws Exception;
		
		// 교수 정보 삭제 
		public int delete(ProfessorDTO profrssorDTO)throws Exception;
		
		public Long getCount(Pager pager)throws Exception;
	
}
