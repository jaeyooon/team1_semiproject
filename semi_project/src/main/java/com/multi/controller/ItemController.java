package com.multi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.multi.dto.ItemDTO;
import com.multi.service.ItemService;

@Controller
public class ItemController {
	
	@Autowired
	ItemService item_service;	
	
	
	@RequestMapping("/info")
	public String info(Model model, int itemid) {
		ItemDTO item = null;
		try {
			item = item_service.get(itemid);
			model.addAttribute("info", item);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		model.addAttribute("center", "info");
		return "main";
	}
}
