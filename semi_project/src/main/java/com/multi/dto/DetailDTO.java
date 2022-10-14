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

	public int getDetailid() {
		return detailid;
	}

	public void setDetailid(int detailid) {
		this.detailid = detailid;
	}

	public int getPurchaseid() {
		return purchaseid;
	}

	public void setPurchaseid(int purchaseid) {
		this.purchaseid = purchaseid;
	}

	public int getItemid() {
		return itemid;
	}

	public void setItemid(int itemid) {
		this.itemid = itemid;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public String getItem_name() {
		return item_name;
	}

	public void setItem_name(String item_name) {
		this.item_name = item_name;
	}

	public String getItem_image() {
		return item_image;
	}

	public void setItem_image(String item_image) {
		this.item_image = item_image;
	}

	public int getP_totalprice() {
		return p_totalprice;
	}

	public void setP_totalprice(int p_totalprice) {
		this.p_totalprice = p_totalprice;
	}

	@Override
	public String toString() {
		return "DetailDTO [detailid=" + detailid + ", purchaseid=" + purchaseid + ", itemid=" + itemid + ", count="
				+ count + ", item_name=" + item_name + ", item_image=" + item_image + ", p_totalprice=" + p_totalprice
				+ "]";
	}

	public DetailDTO(int detailid, int purchaseid, int itemid, int count, String item_name, String item_image,
			int p_totalprice) {
		super();
		this.detailid = detailid;
		this.purchaseid = purchaseid;
		this.itemid = itemid;
		this.count = count;
		this.item_name = item_name;
		this.item_image = item_image;
		this.p_totalprice = p_totalprice;
	}

	public DetailDTO() {
	}
	
	
}
