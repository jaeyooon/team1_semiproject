package com.multi.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.multi.dto.AddrDTO;
import com.multi.frame.myMapper;

@Repository
@Mapper
public interface AddrMapper extends myMapper<Integer, AddrDTO> {
	
}
