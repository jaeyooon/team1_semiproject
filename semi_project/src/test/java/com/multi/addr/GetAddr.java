package com.multi.addr;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.multi.dto.AddrDTO;
import com.multi.service.AddrService;

@SpringBootTest
public class GetAddr {

	@Autowired
	AddrService service;
	
	@Test
	void contextLoads() {
		AddrDTO addr = null;
		try {
			addr = service.get(3);
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println(addr);
	}
}
