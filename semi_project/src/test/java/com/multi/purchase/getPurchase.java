package com.multi.purchase;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.multi.dto.PurchaseDTO;
import com.multi.service.PurchaseService;

@SpringBootTest
public class getPurchase {

	@Autowired
	PurchaseService service;

	@Test
	void contextLoads() {
		PurchaseDTO purchase = null;
		try {
			purchase = service.get(11);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println(purchase);
	}
}
