package com.multi.purchase;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.multi.dto.PurchaseDTO;
import com.multi.service.PurchaseService;

@SpringBootTest
public class getAllPurchase {

	@Autowired
	PurchaseService service;

	@Test
	void contextLoads() {
		List<PurchaseDTO> list = null;
		
		try {
			list = service.getall();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		for (PurchaseDTO p : list) {
			System.out.println(p);
		}
	}
}
