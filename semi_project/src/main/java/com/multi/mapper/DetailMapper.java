package com.multi.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.multi.dto.DetailDTO;
import com.multi.frame.myMapper;

@Repository
@Mapper
public interface DetailMapper extends myMapper<Integer, DetailDTO> {
	public List<DetailDTO> getorderdetail(String custid) throws Exception;
}
