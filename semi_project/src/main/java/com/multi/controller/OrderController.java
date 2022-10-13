package com.multi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/order")
public class OrderController {
	
	String dir = "order/";
	
	@RequestMapping("/get")
	public String cate11(Model model) {
		model.addAttribute("center", dir+"orderpage");
		return "main";
	}
	
	
	
}
