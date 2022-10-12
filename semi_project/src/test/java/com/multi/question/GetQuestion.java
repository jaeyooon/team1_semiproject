package com.multi.question;


import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.multi.dto.QuestionDTO;
import com.multi.dto.ReviewDTO;
import com.multi.service.QuestionService;
import com.multi.service.ReviewService;

@SpringBootTest
public class GetQuestion {

	@Autowired
	QuestionService service;
	
	@Test
	void contextLoads() {
		QuestionDTO question = null;
		try {
			question = service.get(10);
			System.out.println(question);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
