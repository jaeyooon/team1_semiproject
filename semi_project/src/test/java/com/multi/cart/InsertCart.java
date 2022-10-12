package com.multi.cart;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.multi.dto.CartDTO;
import com.multi.service.CartService;

@SpringBootTest
public class InsertCart {
	
	@Autowired
	CartService service;
	
	@Test
	void contextLoads() {
		CartDTO cart = new CartDTO(0,"id08",101,1,2190,"영창피아노", 12909990, "yungchang.jpg");
		try {
			service.register(cart);
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("ok");
	}
}
