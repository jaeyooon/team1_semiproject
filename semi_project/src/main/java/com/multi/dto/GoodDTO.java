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
public class GoodDTO {
	
	private int goodid;
	private String custid;
	private int itemid;
	
	private String item_name;
	private int item_price;
	private String item_image;

}
