package com.multi.good;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.multi.dto.GoodDTO;
import com.multi.dto.ReviewDTO;
import com.multi.service.GoodService;
import com.multi.service.ReviewService;

@SpringBootTest
public class GetAllGood {

	@Autowired
	GoodService service;
	
	@Test
	void contextLoads() {
		List<GoodDTO> list = null;
		try {
			list = service.getallgood("id03");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		for(GoodDTO g:list) {
			System.out.println(g);
		}
	}
}
