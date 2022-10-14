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
	public int getGoodid() {
		return goodid;
	}
	public void setGoodid(int goodid) {
		this.goodid = goodid;
	}
	public String getCustid() {
		return custid;
	}
	public void setCustid(String custid) {
		this.custid = custid;
	}
	public int getItemid() {
		return itemid;
	}
	public void setItemid(int itemid) {
		this.itemid = itemid;
	}
	public String getItem_name() {
		return item_name;
	}
	public void setItem_name(String item_name) {
		this.item_name = item_name;
	}
	public int getItem_price() {
		return item_price;
	}
	public void setItem_price(int item_price) {
		this.item_price = item_price;
	}
	public String getItem_image() {
		return item_image;
	}
	public void setItem_image(String item_image) {
		this.item_image = item_image;
	}
	@Override
	public String toString() {
		return "GoodDTO [goodid=" + goodid + ", custid=" + custid + ", itemid=" + itemid + ", item_name=" + item_name
				+ ", item_price=" + item_price + ", item_image=" + item_image + "]";
	}
	public GoodDTO(int goodid, String custid, int itemid, String item_name, int item_price, String item_image) {
		super();
		this.goodid = goodid;
		this.custid = custid;
		this.itemid = itemid;
		this.item_name = item_name;
		this.item_price = item_price;
		this.item_image = item_image;
	}
	public GoodDTO() {
	}
	
}
