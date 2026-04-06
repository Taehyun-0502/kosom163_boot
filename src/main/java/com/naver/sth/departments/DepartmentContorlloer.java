package com.naver.sth.departments;



import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.http.client.ClientHttpRequestFactorySettings;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/department/*")
public class DepartmentContorlloer {
	
	@Autowired
	private DepartmentService departmentService;
	
	
	@GetMapping("list")
	public void list () throws Exception {
		
		System.out.println("controller list");
		
		ArrayList<DepartmentDTO> ar = this.departmentService.lsit();
		
//		for(int i=0;i< ar.size();i++ ) {
//			System.out.println(ar.get(i));
//		}
		//for (데이터입 변수명 : collection){} (향상된 포문)
		for(DepartmentDTO dto :ar) {
			System.out.println(dto);
		}	
		
		
		
	}
	
	
}
