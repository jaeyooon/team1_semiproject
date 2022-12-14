package com.multi.controller;


import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.multi.dto.CustomerDTO;
import com.multi.dto.GoodDTO;
import com.multi.dto.ItemDTO;
import com.multi.dto.QuestionDTO;
import com.multi.service.AddrService;
import com.multi.service.CustomerService;
import com.multi.service.GoodService;
import com.multi.service.ItemService;
import com.multi.service.QuestionService;

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
	
	@Autowired
	QuestionService ques_service;
	
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
		List<ItemDTO> list = null;
		try {
			list= item_service.selectbest(2000000);
			model.addAttribute("itemlist",list);
		} catch (Exception e) {
			e.printStackTrace();
		}
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
	
	@RequestMapping("/deletegood")
	public String deletegood(Model model, String id, int goodid) {
		try {
			good_service.remove(goodid);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return "redirect:good?id="+id;
	}
	
	@RequestMapping("/getqna")
	public String getqna(Model model, int itemid, QuestionDTO ques) {
		List<QuestionDTO> list = null;
		try {
			list = ques_service.getitemquestion(itemid);
			model.addAttribute("list", list);
			model.addAttribute("center", "qnalist");
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println(list);
		return "main";
	}
	
	@RequestMapping("/signupimpl")
	public String signupimpl(Model model, CustomerDTO cust, HttpSession session) {
		try {
			service.register(cust);
			session.setAttribute("logincust", cust);
			model.addAttribute("center", "signupok");
			model.addAttribute("rightsign", cust);
		} catch (Exception e) {
			model.addAttribute("center", "signupfail");
			model.addAttribute("failsign", cust.getCustid());
		}
		return "main";
	}
}
