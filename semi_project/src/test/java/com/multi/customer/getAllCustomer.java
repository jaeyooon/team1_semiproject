package com.multi.customer;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.multi.dto.CustomerDTO;
import com.multi.service.CustomerService;

@SpringBootTest
public class getAllCustomer {

	@Autowired
	CustomerService service;

	@Test
	void contextLoads() {
		List<CustomerDTO> list = null;
		
		try {
			list = service.getall();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		for (CustomerDTO c : list) {
			System.out.println(c);
		}
	}
}
