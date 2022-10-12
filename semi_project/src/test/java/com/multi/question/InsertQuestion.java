package com.multi.question;


import java.util.Date;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.multi.dto.QuestionDTO;
import com.multi.dto.ReviewDTO;
import com.multi.service.QuestionService;
import com.multi.service.ReviewService;

@SpringBootTest
public class InsertQuestion {

	@Autowired
	QuestionService service;
	
	@Test
	void contextLoads() { 																// 2022-05-01
		QuestionDTO question = new QuestionDTO(0, "id05", 108, "배송이 얼마나 걸리는지 문의드려요.", "미답변", new Date("Sun, 01 May 2022 00:00:00 +0900"));
		try {
			service.register(question);
			System.out.println("OK");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
