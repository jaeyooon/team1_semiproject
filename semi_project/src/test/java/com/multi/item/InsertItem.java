package com.multi.item;

import java.util.Date;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.multi.dto.ItemDTO;
import com.multi.service.ItemService;

@SpringBootTest
public class InsertItem {

	@Autowired
	ItemService service;
	
	@Test
	void contextLoads() {
		ItemDTO item = new ItemDTO(0, 42, "T6", "고급 일렉기타입니다", 5340000, new Date("Wed, 12 Oct 2022 00:00:00 +0900"), "신상품","V5.jpg");
		try {
			service.register(item);
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("ok");
	}
}
