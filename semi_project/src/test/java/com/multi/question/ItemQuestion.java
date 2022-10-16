package com.multi.question;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.multi.dto.QuestionDTO;
import com.multi.dto.ReviewDTO;
import com.multi.service.QuestionService;
import com.multi.service.ReviewService;

@SpringBootTest
public class ItemQuestion {

	@Autowired
	QuestionService service;
	
	@Test
	void contextLoads() {
		List<QuestionDTO> list = null;
		try {
			list = service.getitemquestion(100);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		for(QuestionDTO q:list) {
			System.out.println(q);
		}
	}
}
