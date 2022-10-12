package com.multi.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.multi.dto.QuestionDTO;
import com.multi.frame.myMapper;

@Repository
@Mapper 
public interface QuestionMapper extends myMapper<Integer, QuestionDTO>{ 

}
