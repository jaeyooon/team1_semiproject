package com.multi.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.multi.dto.ReviewDTO;
import com.multi.frame.Util;
import com.multi.service.ReviewService;



@Controller
@RequestMapping("/review")
public class ReviewController {

	String dir = "review/";
	
	@Autowired
	ReviewService service;
	
	@Value("${reviewdir}")
	String reviewdir;
	
	
	@RequestMapping("/register")
	public String register(Model model) {
		model.addAttribute("center", dir+"newreview");
		return "main";
	}
	
	@RequestMapping("/reviewimpl")
	public String reviewimpl(Model model, ReviewDTO review) {
		
		String newimgname = review.getNewimg().getOriginalFilename();
		review.setImg(newimgname);
		
		try {
			Util.saveFile(review.getNewimg(), reviewdir);
			service.register(review);
			System.out.println("OK");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "main";
	}
	
	
}
