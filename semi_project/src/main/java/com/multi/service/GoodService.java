package com.multi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.multi.dto.GoodDTO;
import com.multi.frame.myService;
import com.multi.mapper.GoodMapper;

@Service
public class GoodService implements myService<Integer, GoodDTO>{

	@Autowired
	GoodMapper mapper;

	@Override
	public void register(GoodDTO v) throws Exception {
		mapper.insert(v);
	}

	@Override
	public GoodDTO get(Integer k) throws Exception {
		return null;
	}

	@Override
	public void remove(Integer k) throws Exception {
		mapper.delete(k);
	}

	@Override
	public void modify(GoodDTO v) throws Exception {
		mapper.update(v);
	}

	@Override
	public List<GoodDTO> getall() throws Exception {
		return null;
	}
	
	public List<GoodDTO> getallgood(String custid) throws Exception{
		return mapper.getallgood(custid);
	}

}
