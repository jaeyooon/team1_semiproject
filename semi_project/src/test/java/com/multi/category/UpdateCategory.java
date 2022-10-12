package com.multi.category;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.multi.dto.CategoryDTO;
import com.multi.service.CategoryService;

@SpringBootTest
class UpdateCategory {
	
	@Autowired
	CategoryService service;
	
	@Test
	void contextLoads() {
		CategoryDTO category = new CategoryDTO(22,20,"아르센");
		try {
			service.modify(category);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
