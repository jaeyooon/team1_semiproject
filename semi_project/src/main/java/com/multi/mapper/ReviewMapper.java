package com.multi.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.multi.dto.ReviewDTO;
import com.multi.frame.myMapper;

@Repository
@Mapper 
public interface ReviewMapper extends myMapper<Integer, ReviewDTO>{ 

}
