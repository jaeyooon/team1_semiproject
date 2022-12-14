package com.multi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.multi.dto.CartDTO;
import com.multi.frame.myService;
import com.multi.mapper.CartMapper;

@Service
public class CartService implements myService<Integer, CartDTO> {
	
	@Autowired
	CartMapper mapper;

	@Override
	public void register(CartDTO v) throws Exception {
		mapper.insert(v);
	}

	@Override
	public CartDTO get(Integer k) throws Exception {
		return mapper.select(k);
	}

	@Override
	public void remove(Integer k) throws Exception {
		mapper.delete(k);
	}

	@Override
	public void modify(CartDTO v) throws Exception {
		mapper.update(v);
	}

	@Override
	public List<CartDTO> getall() throws Exception {
		return mapper.selectall();
	}
	
	public List<CartDTO> cartall(String custid) throws Exception {
		return mapper.cartall(custid);
	}

	
}
