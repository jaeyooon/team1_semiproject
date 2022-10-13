package com.multi.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.multi.dto.CustomerDTO;
import com.multi.service.CustomerService;

@Controller
public class MainController {
	
	@Autowired
	CustomerService service;
	
	@RequestMapping("/")
	public String main() {
		return "main";
	}
	
	@RequestMapping("/best")
	public String best(Model model) {
		model.addAttribute("center", "best");
		return "main";
	}
	
	@RequestMapping("/shop")
	public String shop(Model model) {
		model.addAttribute("center", "shop");
		return "main";
	}
	
	@RequestMapping("/signup")
	public String signup(Model model) {
		model.addAttribute("center", "signup");
		return "main";
	}
	
	@RequestMapping("/logout")
	public String logout(HttpSession session) {
		if(session != null) {
			session.invalidate(); // session에 들어가있는 정보 없앰
		}
		return "main";
	}
	
	@RequestMapping("/login")
	public String login(Model model) {
		model.addAttribute("center", "login");
		return "main";
	}
	
	@RequestMapping("/loginimpl")
	public String loginimpl(HttpSession session, String id, String pwd) {
		CustomerDTO cust = null;
		try {
			cust = service.get(id);
			if(cust != null) {
				if(cust.getPwd().equals(pwd)) {
					session.setAttribute("logincust", cust); 
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "redirect:/";
	}
	
	@RequestMapping("/good")
	public String good(Model model) {
		model.addAttribute("center", "getgoodlist");
		return "main";
	}
	
	@RequestMapping("/address")
	public String addr(Model model) {
		model.addAttribute("center", "getaddrlist");
		return "main";
	}
}
