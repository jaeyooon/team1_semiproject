package com.multi.review;


import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.multi.dto.ReviewDTO;
import com.multi.service.ReviewService;

@SpringBootTest
public class UpdateReview {

	@Autowired
	ReviewService service;
	
	@Test
	void contextLoads() {
		ReviewDTO review = new ReviewDTO(10,"id01", 100, "ěľęł ěěđ",null, 5, null);
		try {
			service.modify(review);
			System.out.println("OK");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
