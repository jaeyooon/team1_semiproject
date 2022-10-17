package com.multi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.multi.dto.CartDTO;
import com.multi.service.CartService;

@Controller
@RequestMapping("/cart")
public class CartController {

	@Autowired
	CartService cart_service;
	
	String dir = "cart/";

	@RequestMapping("/get")
	public String get(String id, Model model) {
		List<CartDTO> list = null;
		try {
			list = cart_service.cartall(id);
			model.addAttribute("cartlist", list);
			model.addAttribute("center", dir + "cartlist");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "main";
	}

	@RequestMapping("/delete")
	public String delete(Model model, int cartid, String id) {
		try {
			cart_service.remove(cartid);;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "redirect:get?id=" + id;
	}
}
