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
	public int getCartid() {
		return cartid;
	}
	public void setCartid(int cartid) {
		this.cartid = cartid;
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
	public int getCnt() {
		return cnt;
	}
	public void setCnt(int cnt) {
		this.cnt = cnt;
	}
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
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
		return "CartDTO [cartid=" + cartid + ", custid=" + custid + ", itemid=" + itemid + ", cnt=" + cnt + ", total="
				+ total + ", item_name=" + item_name + ", item_price=" + item_price + ", item_image=" + item_image
				+ "]";
	}
	public CartDTO(int cartid, String custid, int itemid, int cnt, int total, String item_name, int item_price,
			String item_image) {
		super();
		this.cartid = cartid;
		this.custid = custid;
		this.itemid = itemid;
		this.cnt = cnt;
		this.total = total;
		this.item_name = item_name;
		this.item_price = item_price;
		this.item_image = item_image;
	}
	public CartDTO() {
	}
	
}
