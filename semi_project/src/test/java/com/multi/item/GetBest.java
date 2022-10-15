package com.multi.item;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.multi.dto.ItemDTO;
import com.multi.service.ItemService;

@SpringBootTest
public class GetBest {
	@Autowired
	ItemService service;
	
	@Test
	void contextLoads() {
		List<ItemDTO> list = null;
		try {
			list = service.selectbest(2000000);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		for(ItemDTO c:list) {
			System.out.println(c);
		}
	}

}
