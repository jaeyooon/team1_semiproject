package com.multi.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.multi.dto.ReviewDTO;
import com.multi.frame.myMapper;

@Repository
@Mapper 
public interface ReviewMapper extends myMapper<Integer, ReviewDTO>{ 

	public List<ReviewDTO> getitemreview(int itemid) throws Exception;
}
