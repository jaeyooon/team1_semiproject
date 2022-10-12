package com.multi.good;


import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.multi.dto.GoodDTO;
import com.multi.dto.ReviewDTO;
import com.multi.service.GoodService;

@SpringBootTest
public class InsertGood {

	@Autowired
	GoodService service;
	
	@Test
	void contextLoads() {
		GoodDTO good = new GoodDTO(0,"id02", 108, "AWV-295F", 266800, "AWV-295F.jpg");
		try {
			service.register(good);
			System.out.println("OK");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
