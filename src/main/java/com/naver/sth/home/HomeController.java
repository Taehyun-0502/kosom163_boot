package com.naver.sth.home;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


// 객체 생성 + 역활
@Controller
public class HomeController {
	

	
	
	@RequestMapping(value ="/", method =RequestMethod.GET )
	public String home() throws Exception {
		
	
		
		
		return "index";
	}

}
