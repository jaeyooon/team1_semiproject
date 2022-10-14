package com.multi.review;


import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.multi.dto.ReviewDTO;
import com.multi.service.ReviewService;

@SpringBootTest
public class InsertReview {

	@Autowired
	ReviewService service;
	
	@Test
	void contextLoads() {
		ReviewDTO review = new ReviewDTO(0,"id04", 102, "배송 빨라요.",null, 4, null);
		try {
			service.register(review);
			System.out.println("OK");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
