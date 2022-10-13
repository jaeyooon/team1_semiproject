package com.multi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/cust")
public class CustomerController {
	
	String dir = "cust/";
	
	@RequestMapping("/custdetail")
	public String cate11(Model model) {
		model.addAttribute("center", dir+"custdetail");
		return "main";
	}
	
	
	
}
