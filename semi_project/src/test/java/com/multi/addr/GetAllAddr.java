package com.multi.addr;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.multi.dto.AddrDTO;
import com.multi.service.AddrService;

@SpringBootTest
public class GetAllAddr {
	
	@Autowired
	AddrService service;
	
	@Test
	void contextLoads() {
		List<AddrDTO> list = null;
		try {
			list = service.getall();
		} catch (Exception e) {
			e.printStackTrace();
		}
		for(AddrDTO c:list) {
			System.out.println(c);
		}
	}
}
