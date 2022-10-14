package com.multi.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.multi.dto.ItemDTO;
import com.multi.service.ItemService;



@Controller
@RequestMapping("/cate")
public class CategoryController {

	@Autowired
	ItemService item_service;
	
	String dir = "cate/";
	
	@RequestMapping("/cate11")
	public String cate11(Model model) {
		List<ItemDTO> list = null;
		try {
			list= item_service.selectcate(11);
			model.addAttribute("itemlist",list);
		} catch (Exception e) {
			e.printStackTrace();
		}
		model.addAttribute("center", dir+"cate11");
		return "main";
	}
	
	@RequestMapping("/cate12")
	public String cate12(Model model) {
		List<ItemDTO> list = null;
		try {
			list= item_service.selectcate(12);
			model.addAttribute("itemlist",list);
		} catch (Exception e) {
			e.printStackTrace();
		}
		model.addAttribute("center", dir+"cate12");
		return "main";
	}
	
	@RequestMapping("/cate21")
	public String cate21(Model model) {
		List<ItemDTO> list = null;
		try {
			list= item_service.selectcate(21);
			model.addAttribute("itemlist",list);
		} catch (Exception e) {
			e.printStackTrace();
		}
		model.addAttribute("center", dir+"cate21");
		return "main";
	}
	
	@RequestMapping("/cate22")
	public String cate22(Model model) {
		List<ItemDTO> list = null;
		try {
			list= item_service.selectcate(22);
			model.addAttribute("itemlist",list);
		} catch (Exception e) {
			e.printStackTrace();
		}
		model.addAttribute("center", dir+"cate22");
		return "main";
	}
	
	@RequestMapping("/cate31")
	public String cate31(Model model) {
		List<ItemDTO> list = null;
		try {
			list= item_service.selectcate(31);
			model.addAttribute("itemlist",list);
		} catch (Exception e) {
			e.printStackTrace();
		}
		model.addAttribute("center", dir+"cate31");
		return "main";
	}
	
	@RequestMapping("/cate32")
	public String cate32(Model model) {
		List<ItemDTO> list = null;
		try {
			list= item_service.selectcate(32);
			model.addAttribute("itemlist",list);
		} catch (Exception e) {
			e.printStackTrace();
		}
		model.addAttribute("center", dir+"cate32");
		return "main";
	}
	
	@RequestMapping("/cate41")
	public String cate41(Model model) {
		List<ItemDTO> list = null;
		try {
			list= item_service.selectcate(41);
			model.addAttribute("itemlist",list);
		} catch (Exception e) {
			e.printStackTrace();
		}
		model.addAttribute("center", dir+"cate41");
		return "main";
	}
	
	@RequestMapping("/cate42")
	public String cate42(Model model) {
		List<ItemDTO> list = null;
		try {
			list= item_service.selectcate(42);
			model.addAttribute("itemlist",list);
		} catch (Exception e) {
			e.printStackTrace();
		}
		model.addAttribute("center", dir+"cate42");
		return "main";
	}

	
}
