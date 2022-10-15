package com.multi.controller;


import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.multi.dto.AddrDTO;
import com.multi.dto.CustomerDTO;
import com.multi.dto.GoodDTO;
import com.multi.dto.ItemDTO;
import com.multi.service.AddrService;
import com.multi.service.CustomerService;
import com.multi.service.GoodService;
import com.multi.service.ItemService;

@Controller
public class MainController {
	
	@Autowired
	CustomerService service;
	
	@Autowired
	ItemService item_service;
	
	@Autowired
	GoodService good_service;
	
	@Autowired
	AddrService addr_service;
	
	String dir = "addr/";
	
	@RequestMapping("/")
	public String main(Model model) {
		List<ItemDTO> list = null; 
		
		try {
			list = item_service.getall();
			model.addAttribute("itemlist", list);
		} catch (Exception e) {
			e.printStackTrace();
		}
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
	public String good(Model model, String id) {
		List<GoodDTO> list = null;
		try {
			list = good_service.getallgood(id);
			model.addAttribute("list", list);
			model.addAttribute("center", "getgoodlist");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return "main";
	}
	
	@RequestMapping("/address")
	public String address(Model model, String id) {
		List<AddrDTO> list = null;
		
		try {
			list = addr_service.myaddr(id);
			model.addAttribute("list", list);
			model.addAttribute("center", dir+"addrlist");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "main";
		
	}
}
