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
public class UpdateQuestion {

	@Autowired
	QuestionService service;
	
	@Test
	void contextLoads() {																						// 2022-04-03
		QuestionDTO question = new QuestionDTO(13, "id04", 103, "상품이 불량이라 반품하고 싶습니다. 답변 부탁드려요.", "미답변", new Date("Sun, 03 Apr 2022 00:00:00 +0900"));
		try {
			service.modify(question);
			System.out.println("OK");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
