package com.multi.purchase;


import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.multi.dto.DetailDTO;
import com.multi.dto.PurchaseDTO;
import com.multi.service.DetailService;
import com.multi.service.PurchaseService;

@SpringBootTest
public class InsertPurchase {

	@Autowired
	PurchaseService service;
	
	@Autowired
	DetailService service2;
	
	@Test
	void contextLoads() {
		PurchaseDTO purchase = new PurchaseDTO(0, "id05", "멀캠", "멀티캠퍼스", "서울특별시 강남구", "010-1987-2233", "신용카드", 610000);
		try {
			service.register(purchase);
			int r = purchase.getPurchaseid();
			System.out.println("Register OK "+r);
			DetailDTO detail = new DetailDTO(0, r, 104, 1, "YFL-222", "YFL-222.jpg",610000);
			service2.register(detail);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
