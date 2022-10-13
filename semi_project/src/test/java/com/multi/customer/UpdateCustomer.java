package com.multi.customer;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.multi.dto.CustomerDTO;
import com.multi.service.CustomerService;

@SpringBootTest
class UpdateCustomer {
	
	@Autowired
	CustomerService service;
	
	@Test
	void contextLoads() {
		CustomerDTO cust = new CustomerDTO("id03", "pwd03", "조재윤", "010-4545-7676", "1998-03-22", "F", "강원도 강릉시", 3, "20% 쿠폰");
		try {
			service.modify(cust);
			System.out.println("OK");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
