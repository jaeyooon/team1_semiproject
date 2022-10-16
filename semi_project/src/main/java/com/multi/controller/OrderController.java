package com.multi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.multi.dto.DetailDTO;
import com.multi.dto.PurchaseDTO;
import com.multi.service.DetailService;
import com.multi.service.PurchaseService;

@Controller
@RequestMapping("/order")
public class OrderController {
	
	@Autowired
	DetailService detail_service;
	
	String dir = "order/";
	
	@RequestMapping("/get")
	public String cate11(Model model, String id) {
		List<DetailDTO> list = null;
		try {
			list = detail_service.getorderdetail(id);
			model.addAttribute("list", list);
			model.addAttribute("center", dir+"orderdetail");
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println(id);
		return "main";
	}
	
	@RequestMapping("/delete")
	public String delete(Model model, String custid, int detailid) {
		try {
			detail_service.remove(detailid);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "redirect:get?id="+custid;
	}
	
	
}
