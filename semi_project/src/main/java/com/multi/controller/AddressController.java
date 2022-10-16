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
	
//	@RequestMapping("update")
//	public String update(Model model) {
//		model.addAttribute("center", dir + "addrupdate");
//
//		return "main";
//	}

	@RequestMapping("/delete")
	public String delete(int id, Model model) {
		try {
			addr_service.remove(id);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "redirect:/address";

	}
}
