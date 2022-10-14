package com.multi.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.multi.dto.PurchaseDTO;
import com.multi.frame.myMapper;

@Repository
@Mapper
public interface PurchaseMapper extends myMapper<Integer, PurchaseDTO> {
	public List<PurchaseDTO> getallpurchase(String custid) throws Exception;
}
