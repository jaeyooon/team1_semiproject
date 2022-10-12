package com.multi.addr;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.multi.dto.AddrDTO;
import com.multi.service.AddrService;

@SpringBootTest
public class UpdateAddr {

	@Autowired
	AddrService service;
	
	@Test
	void contextLoads() {
		AddrDTO addr = new AddrDTO(9, "id80","집6", "김성철", "부천시 소사구", "01011112222");
		try {
			service.modify(addr);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
