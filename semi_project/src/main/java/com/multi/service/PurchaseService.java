package com.multi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.multi.dto.PurchaseDTO;
import com.multi.frame.myService;
import com.multi.mapper.PurchaseMapper;

@Service
public class PurchaseService implements myService<Integer, PurchaseDTO>{

	@Autowired
	PurchaseMapper mapper;
	
	@Override
	public void register(PurchaseDTO v) throws Exception {
		mapper.insert(v);
	}

	@Override
	public PurchaseDTO get(Integer k) throws Exception {
		return mapper.select(k);
	}

	@Override
	public void remove(Integer k) throws Exception {
		mapper.delete(k);
	}

	@Override
	public void modify(PurchaseDTO v) throws Exception {
		mapper.update(v);
	}

	@Override
	public List<PurchaseDTO> getall() throws Exception {
		return null;
	}
	
	public List<PurchaseDTO> getallpurchase(String custid) throws Exception{
		return mapper.getallpurchase(custid);
	}

}
