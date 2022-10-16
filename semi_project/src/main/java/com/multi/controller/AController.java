package com.multi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.multi.dto.CartDTO;
import com.multi.dto.CustomerDTO;
import com.multi.dto.GoodDTO;
import com.multi.service.CartService;
import com.multi.service.CustomerService;
import com.multi.service.GoodService;

@RestController
public class AController {
	
	@Autowired
	CustomerService cust_service;
	
	@Autowired
	CartService cart_service;
	
	@Autowired
	GoodService good_service;
	
	
	@RequestMapping("/checkid")
	public Object checkid(String cid) {
		String result = "";
		CustomerDTO cust = null;
		try {
			cust = cust_service.get(cid);
			if(cust != null) {
				result = "f";
			}else {
				result = "t"; 
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return result;
	}
	
	@RequestMapping("/cartinsert")
	public Object addcart(CartDTO cart) {
		try {
			cart_service.register(cart);;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "";
	}
	
	@RequestMapping("/goodinsert")
	public Object addcart(GoodDTO good) {
		try {
			good_service.register(good);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "";
	}
}
