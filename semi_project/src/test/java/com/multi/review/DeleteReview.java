package com.multi.review;


import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.multi.dto.ReviewDTO;
import com.multi.service.ReviewService;

@SpringBootTest
public class DeleteReview {

	@Autowired
	ReviewService service;
	
	@Test
	void contextLoads() {
		try {
			service.remove(11);
			System.out.println("OK");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
