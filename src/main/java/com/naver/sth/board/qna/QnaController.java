package com.naver.sth.board.qna;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.naver.sth.page.Pager;

@Controller
@RequestMapping("/qna/*")
public class QnaController {
	
	@Autowired
	private QnaService qnaService;
	
	@GetMapping("list")
	public String list(Pager pager, Model model)throws Exception{
		List<QnaDTO> ar =qnaService.list(pager);
		
		model.addAttribute("list", ar);
		return"/qna/list";
		
	}
	
	@GetMapping("create")
	public void create()throws Exception{
		
	}
	@PostMapping("create")
	public String create(QnaDTO qnaDTO, @RequestParam(name="attach")MultipartFile [] attach) throws Exception{
		
		 int result = qnaService.create(qnaDTO,attach);
		
		
		return "redirect:./list";
	}
	@GetMapping("detail")
	public String detail(QnaDTO qnaDTO,Model model) throws Exception{
		
		qnaDTO=qnaService.detail(qnaDTO);
		model.addAttribute("detail",qnaDTO);
		return "qna/detail";
		
	}
	@GetMapping("reply")
	public void replyCreate(QnaDTO qnaDTO ,Model model)throws Exception {
		model.addAttribute("qnaDTO",qnaDTO);
		
	}
	@PostMapping("reply")
	public  String replyCreate(QnaDTO qnaDTO)throws Exception {
		
		int result = qnaService.replyCreate(qnaDTO);
		
		return "redirect:./list";
		
	}
	
	

}
