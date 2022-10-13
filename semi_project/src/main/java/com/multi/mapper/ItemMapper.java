package com.multi.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.multi.dto.ItemDTO;
import com.multi.frame.myMapper;

@Repository
@Mapper
public interface ItemMapper extends myMapper<Integer, ItemDTO>{
	public List<ItemDTO> selectcate(int cateid) throws Exception;
}
