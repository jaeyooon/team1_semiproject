package com.multi.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString
public class CartDTO {
	private int cartid;
	private String custid;
	private int itemid;
	private int cnt;
	private int total;
	
	private String item_name;
	private int item_price;
	private String item_image;
}
