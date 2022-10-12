package com.multi.category;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.multi.dto.CategoryDTO;
import com.multi.service.CategoryService;

@SpringBootTest
public class GetAllCategory {
	
	@Autowired
	CategoryService service;
	
	@Test
	void contextLoads() {
		List<CategoryDTO> list = null;
		try {
			list = service.getall();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		for(CategoryDTO c:list) {
			System.out.println(c);
		}
	}
}
