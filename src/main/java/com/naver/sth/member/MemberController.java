package com.naver.sth.member;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import jakarta.servlet.http.HttpServletRequest;

//annotation 설명과 기능이 포함됨 
@Controller 
@RequestMapping("/member/*") // **이 두게일땐 폴더가 하나 더있다면 
public class MemberController {
	
	@Autowired
	private MemberService memberService;
	
	
	@RequestMapping(value = "join", method = RequestMethod.GET )
	public String join() {
		
		System.out.println("회원가입 페이지");
		
		return "member/join";
	}
	//1번
//	@RequestMapping(value = "join", method = RequestMethod.POST )
//	public void join (HttpServletRequest request) {
//		System.out.println("join post");
//		String name = request.getParameter("name");
//		String age = request.getParameter("age");
//		String birth = request.getParameter("birth");
//		String[] nums = request.getParameterValues("num");
//		
//		
//		System.out.println(name+age+birth);
//		
//	}
	// 2번
//	@RequestMapping(value = "join", method = RequestMethod.POST )
//	public void join (@RequestParam(name = "name") String name, @RequestParam(name = "age") Integer age) {
//		
//		MemberDTO memberDTO =new MemberDTO();
//		memberDTO.setName(name);
//		memberDTO.setAge(age);
//		
//		System.out.println("join post");
//		
//		
//	}
	@RequestMapping(value = "join", method = RequestMethod.POST )
	public void join (MemberDTO memberDTO) {
		//파미터의 이름과 dto의 setter의 이름이 같아야 한다. 
		//데이터 타입도 돌일해야함
		
		System.out.println(memberDTO.getAge());
		
		
		
		System.out.println("join post");
		
		
	}
	
	
	
	@RequestMapping("login")
	public String login() {
		
		return "member/login";
		
	}
	

}
