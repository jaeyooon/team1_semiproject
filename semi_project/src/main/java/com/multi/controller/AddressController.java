package com.multi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.multi.dto.AddrDTO;
import com.multi.service.AddrService;

@Controller
@RequestMapping("/address")
public class AddressController {

	@Autowired
	AddrService addr_service;

	String dir = "addr/";

	@RequestMapping("")
	public String address(Model model, String id) {
		List<AddrDTO> list = null;

		try {
			list = addr_service.myaddr(id);
			model.addAttribute("list", list);
			model.addAttribute("center", dir + "addrlist");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "main";
	}
	
	@RequestMapping("/updateimpl")
	public String updateimpl(Model model, AddrDTO addr) {
		try {
			addr_service.modify(addr);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "redirect:?id="+addr.getCustid();
	}
	
	@RequestMapping("/update")
	public String update(Model model, int id) {
		AddrDTO addr = null;
		try {
			addr = addr_service.get(id);
			model.addAttribute("forupdate", addr);
			model.addAttribute("center", dir + "addrupdate");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "main";
	}

	@RequestMapping("/delete")
	public String delete(Model model, String custid, int id) {
		try {
			addr_service.remove(id);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "redirect:/address?id="+custid;

	}
	
	@RequestMapping("/register")
	public String register(Model model) {
		model.addAttribute("center", dir+"registeraddr");
		return "main";

	}
	
	@RequestMapping("/registerimpl")
	public String registerimpl(Model model, AddrDTO addr) {
		try {
			addr_service.register(addr);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "redirect:?id="+addr.getCustid();

	}
	

}
