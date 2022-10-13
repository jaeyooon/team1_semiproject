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
	
//	밑에 매핑이랑 겹처서 일단 주석 해두었습니다...
//	@RequestMapping("/")
//	public String main() {
//		return "main";
//	}
	
//	메인페이지에 나타나는 상품 리스트
	@RequestMapping("/")
	public String mainproducts(Model model) {
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
	public String addr(Model model) {
		model.addAttribute("center", "getaddrlist");
		return "main";
	}
}
