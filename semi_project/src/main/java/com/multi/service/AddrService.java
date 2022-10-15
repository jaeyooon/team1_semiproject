package com.multi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.multi.dto.AddrDTO;
import com.multi.frame.myService;
import com.multi.mapper.AddrMapper;

@Service
public class AddrService implements myService<Integer, AddrDTO> {

	@Autowired
	AddrMapper mapper;

	@Override
	public void register(AddrDTO v) throws Exception {
		mapper.insert(v);
	}

	@Override
	public AddrDTO get(Integer k) throws Exception {
		return mapper.select(k);
	}

	@Override
	public void remove(Integer k) throws Exception {
		mapper.delete(k);
	}

	@Override
	public void modify(AddrDTO v) throws Exception {
		mapper.update(v);
	}

	@Override
	public List<AddrDTO> getall() throws Exception {
		return mapper.selectall();
	}
	
	public List<AddrDTO> myaddr(String custid) throws Exception {
		return mapper.myaddr(custid);
	}
}
	
