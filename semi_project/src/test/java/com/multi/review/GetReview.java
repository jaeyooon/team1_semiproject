package com.multi.review;


import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.multi.dto.ReviewDTO;
import com.multi.service.ReviewService;

@SpringBootTest
public class GetReview {

	@Autowired
	ReviewService service;
	
	@Test
	void contextLoads() {
		ReviewDTO review = null;
		try {
			review = service.get(10);
			System.out.println(review);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
