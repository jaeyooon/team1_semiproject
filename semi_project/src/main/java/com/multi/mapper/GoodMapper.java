package com.multi.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.multi.dto.GoodDTO;
import com.multi.frame.myMapper;

@Repository
@Mapper 
public interface GoodMapper extends myMapper<Integer, GoodDTO>{ 
	public List<GoodDTO> getallgood(String custid) throws Exception;
}
