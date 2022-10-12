package com.multi.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.multi.dto.CustomerDTO;
import com.multi.frame.myMapper;

@Repository
@Mapper
public interface CustomerMapper extends myMapper<String, CustomerDTO> {

}
