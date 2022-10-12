package com.multi.addr;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.multi.service.AddrService;

@SpringBootTest
class DeleteAddr {
	
	@Autowired
	AddrService service;
	
	@Test
	void contextLoads() {
		try {
			service.remove(9);
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("ok");
	}
}
