package com.multi.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.multi.dto.QuestionDTO;
import com.multi.frame.myMapper;

@Repository
@Mapper 
public interface QuestionMapper extends myMapper<Integer, QuestionDTO>{ 

	public List<QuestionDTO> getitemquestion(int itemid) throws Exception;
}
