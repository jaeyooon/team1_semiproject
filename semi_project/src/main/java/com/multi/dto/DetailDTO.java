package com.multi.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@ToString
public class DetailDTO {
	private int detailid;
	private int purchaseid;
	private int itemid;
	private int count;
	
	private String item_name;
	private String item_image;
	
	private int p_totalprice;


}
