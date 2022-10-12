package com.multi.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.multi.dto.CategoryDTO;
import com.multi.frame.myMapper;

@Repository
@Mapper
public interface CategoryMapper extends myMapper<Integer, CategoryDTO> {
	
}
