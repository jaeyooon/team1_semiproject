package com.multi.cart;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.multi.dto.CartDTO;
import com.multi.service.CartService;

@SpringBootTest
class UpdateCart {
	
	@Autowired
	CartService service;
	
	@Test
	void contextLoads() {
		CartDTO cart = new CartDTO(5, "id88", 112, 3, 124481,"금영피아노", 51135000, "kumyoung.jpg");
		try {
			service.modify(cart);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
