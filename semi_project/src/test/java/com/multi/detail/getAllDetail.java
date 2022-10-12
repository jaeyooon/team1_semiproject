package com.multi.detail;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.multi.dto.DetailDTO;
import com.multi.service.DetailService;

@SpringBootTest
public class getAllDetail {

	@Autowired
	DetailService service;

	@Test
	void contextLoads() {
		List<DetailDTO> list = null;
		
		try {
			list = service.getall();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		for (DetailDTO d : list) {
			System.out.println(d);
		}
	}
}
