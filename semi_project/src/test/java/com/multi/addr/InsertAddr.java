package com.multi.addr;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.multi.dto.AddrDTO;
import com.multi.service.AddrService;

@SpringBootTest
public class InsertAddr {
	
	@Autowired
	AddrService service;
	
	@Test
	void contextLoads() {
		AddrDTO addr = new AddrDTO(0, "id09", "집5","민성하","대전광역시 서구", "01097271942");
		try {
			service.register(addr);
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("ok");
	}
}
