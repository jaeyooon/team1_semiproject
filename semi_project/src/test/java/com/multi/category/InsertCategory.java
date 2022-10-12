package com.multi.category;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.multi.dto.CategoryDTO;
import com.multi.service.CategoryService;

@SpringBootTest
public class InsertCategory {
	
	@Autowired
	CategoryService service;
	
	@Test
	void contextLoads() {
		CategoryDTO category = new CategoryDTO(43, 40, "스위프트");
		try {
			service.register(category);
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("ok");
	}
}
