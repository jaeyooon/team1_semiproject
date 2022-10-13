package com.multi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/cart")
public class CartController {
	
	String dir = "cart/";
	
	@RequestMapping("/get")
	public String cate11(Model model) {
		model.addAttribute("center", dir+"getcartlist");
		return "main";
	}
	
	
	
}
