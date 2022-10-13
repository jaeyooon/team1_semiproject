package com.multi.customer;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.multi.dto.CustomerDTO;
import com.multi.service.CustomerService;

@SpringBootTest
public class GetCustomer {

	@Autowired
	CustomerService service;
	
	@Test
	void contextLoads() {
		CustomerDTO cust = null;
		try {
			cust = service.get("id01");
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println(cust);
	}
}
