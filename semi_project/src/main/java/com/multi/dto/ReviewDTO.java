package com.multi.dto;

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

}
