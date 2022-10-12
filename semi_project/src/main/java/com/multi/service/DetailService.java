package com.multi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.multi.dto.DetailDTO;
import com.multi.frame.myService;
import com.multi.mapper.DetailMapper;

@Service
public class DetailService implements myService<Integer, DetailDTO>{

	@Autowired
	DetailMapper mapper;

	@Override
	public void register(DetailDTO v) throws Exception {
		mapper.insert(v);
	}

	@Override
	public DetailDTO get(Integer k) throws Exception {
		return mapper.select(k);
	}

	@Override
	public void remove(Integer k) throws Exception {
		mapper.delete(k);
	}

	@Override
	public void modify(DetailDTO v) throws Exception {
		mapper.update(v);
	}

	@Override
	public List<DetailDTO> getall() throws Exception {
		return mapper.selectall();
	}
	
	

}
