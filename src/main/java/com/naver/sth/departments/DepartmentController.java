package com.naver.sth.departments;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/department/*")
public class DepartmentController {
	
	@Autowired
	private DepartmentService departmentService; 

		@GetMapping("list")
		public String list (Model model) {
			
		    List<DepartmentDTO> ar =this.departmentService.list();
			
		    
		    model.addAttribute("list",ar);
		    
		    return "department/list";
		}
		@GetMapping("detail")
		public void datail(@RequestParam(name="num") String num,Model model) {
			DepartmentDTO departmentDTO = departmentService.detail(num);
			System.out.println(departmentDTO);
			
			model.addAttribute("detail",departmentDTO);
			
			
		}
		@GetMapping("create") // URL 정보와 JSP의 경로가 같다면 void로 리턴한다
		public void create() {}
		
		@PostMapping("create")
		public String create(DepartmentDTO departmentDTO) {
			
			int result = departmentService.create(departmentDTO);
			System.out.println("희망 값 : 1, 실재 값 :  "+ result);	
			return "redirect:./list";
			
			
		}
		@PostMapping("delete")
		public String delete(DepartmentDTO departmentDTO) {
			int result = departmentService.delete(departmentDTO);
			
			return "redirect:./list";
			
			
		}
		@GetMapping("update")
		public void update(DepartmentDTO departmentDTO,Model model) {
			departmentDTO = departmentService.detail(departmentDTO.getDepartmentNo());
			model.addAttribute("d", departmentDTO);
			
		}
		
		@PostMapping("update")
		public String update(DepartmentDTO departmentDTO) {
			
			
			int result = departmentService.update(departmentDTO);
			System.out.println("희망 값 : 1, 실재 값 :  "+ result);
			return "redirect:./list";
			
		}

}
