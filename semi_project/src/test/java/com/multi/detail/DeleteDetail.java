package com.multi.detail;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.multi.service.DetailService;

@SpringBootTest
class DeleteDetail {
	
	@Autowired
	DetailService service;
	
	@Test
	void contextLoads() {
		try {
			service.remove(1002);
			System.out.println("ok");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
