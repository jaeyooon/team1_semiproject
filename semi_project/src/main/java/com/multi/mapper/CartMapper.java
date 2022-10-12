package com.multi.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.multi.dto.CartDTO;
import com.multi.frame.myMapper;


@Repository
@Mapper
public interface CartMapper extends myMapper<Integer, CartDTO> {
	public List<CartDTO> cartall(Integer cartid) throws Exception;
}
