package com.multi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.multi.dto.CategoryDTO;
import com.multi.frame.myService;
import com.multi.mapper.CategoryMapper;

@Service
public class CategoryService implements myService<Integer, CategoryDTO>{
	
	@Autowired
	CategoryMapper mapper;

	@Override
	public void register(CategoryDTO v) throws Exception {
		mapper.insert(v);
	}

	@Override
	public CategoryDTO get(Integer k) throws Exception {
		return mapper.select(k);
	}

	@Override
	public void remove(Integer k) throws Exception {
		mapper.delete(k);
	}

	@Override
	public void modify(CategoryDTO v) throws Exception {
		mapper.update(v);
	}

	@Override
	public List<CategoryDTO> getall() throws Exception {
		return mapper.selectall();
	}

}
