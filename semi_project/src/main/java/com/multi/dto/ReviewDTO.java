package com.multi.dto;

import org.springframework.web.multipart.MultipartFile;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class ReviewDTO {
	
	private int reviewid;
	private String custid;
	private int itemid;
	private String content;
	private String img;
	private int rate;
	
	private MultipartFile newimg; // 파일 덩어리가 여기에 저장되어 서버로 전송됨!
	
}
