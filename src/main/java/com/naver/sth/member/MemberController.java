package com.naver.sth.member;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

//annotation 설명과 기능이 포함됨 
@Controller 
@RequestMapping("/member/*") // **이 두게일땐 폴더가 하나 더있다면 
public class MemberController {
	
	
	@RequestMapping("join")
	public String join() {
		System.out.println("회원가입 페이지");
		return "member/join";
	}
	
	@RequestMapping("login")
	public String login() {
		
		return "member/login";
		
	}
	

}
