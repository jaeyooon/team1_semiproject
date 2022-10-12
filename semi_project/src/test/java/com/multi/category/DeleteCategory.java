package com.multi.category;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.multi.service.CategoryService;

@SpringBootTest
class DeleteCategory {
	
	@Autowired
	CategoryService service;
	
	@Test
	void contextLoads() {
		try {
			service.remove(43);
			System.out.println("ok");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
