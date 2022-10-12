package com.multi.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.multi.dto.PurchaseDTO;
import com.multi.frame.myMapper;

@Repository
@Mapper
public interface PurchaseMapper extends myMapper<Integer, PurchaseDTO> {

}
