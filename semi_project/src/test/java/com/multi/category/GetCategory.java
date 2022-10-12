package com.multi.category;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.multi.dto.CategoryDTO;
import com.multi.service.CategoryService;

@SpringBootTest
public class GetCategory {
	
	@Autowired
	CategoryService service;
	
	@Test
	void contextLoads() {
		CategoryDTO category = null;
		try {
			category = service.get(31);
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println(category);
	}
}
