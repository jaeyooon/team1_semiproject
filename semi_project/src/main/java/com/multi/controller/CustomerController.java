package com.multi.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.multi.dto.CustomerDTO;
import com.multi.service.CustomerService;

@Controller
@RequestMapping("/cust")
public class CustomerController {
	
	String dir = "cust/";
	
	@Autowired
	CustomerService cust_service;
	
	@RequestMapping("/custdetail")
	public String custdetail(String id, Model model) {
		CustomerDTO cust = null;
		try {
			cust = cust_service.get(id);
			model.addAttribute("cust", cust);
			model.addAttribute("center", dir+"custdetail");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "main";
		
	}
	
	@RequestMapping("/update")
	public String update(CustomerDTO cust, Model model) {
		try {
			cust_service.modify(cust);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "redirect:custdetail?id="+cust.getCustid();
	}
	
	@RequestMapping("/delete")
	public String delete(String id, Model model, HttpSession session ) {
		try {
			cust_service.remove(id);
			session.invalidate();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "main";
	}
	
}

