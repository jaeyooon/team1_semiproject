package com.multi.customer;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.multi.dto.CustomerDTO;
import com.multi.service.CustomerService;

@SpringBootTest
public class InsertCustomer {
	
	@Autowired
	CustomerService service;
	
	@Test
	void contextLoads() {
		CustomerDTO cust = new CustomerDTO("id05", "pwd05", "홍말숙", "010-5789-1234", "1996-01-01", "F", "경기도 성남시 분당구");
		try {
			service.register(cust);
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("ok");
	}
}
