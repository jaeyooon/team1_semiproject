package com.multi.detail;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.multi.dto.DetailDTO;
import com.multi.dto.PurchaseDTO;
import com.multi.service.DetailService;
import com.multi.service.PurchaseService;

@SpringBootTest
public class orderDetail_test {
	
	@Autowired
	PurchaseService service;

	@Autowired
	DetailService service1;

	@Test
	void contextLoads() {
		PurchaseDTO purchase = new PurchaseDTO(0, "id05", "멀캠", "멀티캠퍼스", "서울특별시 강남구", "01023374512", "네이버페이", 0);
		try {
			service.register(purchase);
			int r = purchase.getPurchaseid();
			System.out.println("Register OK" + r);
			DetailDTO detail = new DetailDTO(0, r, 0 , 5, "피아노", 50000, "MT-170.jpg");
			service1.register(detail);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
