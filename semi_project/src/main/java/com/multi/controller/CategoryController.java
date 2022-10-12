package com.multi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/cate")
public class CategoryController {
	
	String dir = "cate/";
	
	@RequestMapping("/cate11")
	public String cate11(Model model) {
		model.addAttribute("center", dir+"cate11");
		return "main";
	}
	
	@RequestMapping("/cate12")
	public String cate12(Model model) {
		model.addAttribute("center", dir+"cate12");
		return "main";
	}
	@RequestMapping("/cate21")
	public String cate21(Model model) {
		model.addAttribute("center", dir+"cate21");
		return "main";
	}
	@RequestMapping("/cate22")
	public String cate22(Model model) {
		model.addAttribute("center", dir+"cate22");
		return "main";
	}
	@RequestMapping("/cate31")
	public String cate31(Model model) {
		model.addAttribute("center", dir+"cate31");
		return "main";
	}
	@RequestMapping("/cate32")
	public String cate32(Model model) {
		model.addAttribute("center", dir+"cate32");
		return "main";
	}
	@RequestMapping("/cate41")
	public String cate41(Model model) {
		model.addAttribute("center", dir+"cate41");
		return "main";
	}
	@RequestMapping("/cate42")
	public String cate42(Model model) {
		model.addAttribute("center", dir+"cate42");
		return "main";
	}
	

	
}
