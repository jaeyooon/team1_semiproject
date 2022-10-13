package com.multi.customer;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.multi.service.CustomerService;

@SpringBootTest
class DeleteCustomer {

	@Autowired
	CustomerService service;
	
	@Test
	void contextLoads() {
		try {
			service.remove("id02");
			System.out.println("OK");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
