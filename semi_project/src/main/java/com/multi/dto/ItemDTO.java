package com.multi.dto;

import java.util.Date;

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
public class ItemDTO {
	private int itemid;
	private int cateid;
	private String pname;
	private String info;
	private int price;
	private Date mdate;
	private String checkstatus;
	private String image;
	public int getItemid() {
		return itemid;
	}
	public void setItemid(int itemid) {
		this.itemid = itemid;
	}
	public int getCateid() {
		return cateid;
	}
	public void setCateid(int cateid) {
		this.cateid = cateid;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public String getInfo() {
		return info;
	}
	public void setInfo(String info) {
		this.info = info;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public Date getMdate() {
		return mdate;
	}
	public void setMdate(Date mdate) {
		this.mdate = mdate;
	}
	public String getCheckstatus() {
		return checkstatus;
	}
	public void setCheckstatus(String checkstatus) {
		this.checkstatus = checkstatus;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	@Override
	public String toString() {
		return "ItemDTO [itemid=" + itemid + ", cateid=" + cateid + ", pname=" + pname + ", info=" + info + ", price="
				+ price + ", mdate=" + mdate + ", checkstatus=" + checkstatus + ", image=" + image + "]";
	}
	public ItemDTO(int itemid, int cateid, String pname, String info, int price, Date mdate, String checkstatus,
			String image) {
		super();
		this.itemid = itemid;
		this.cateid = cateid;
		this.pname = pname;
		this.info = info;
		this.price = price;
		this.mdate = mdate;
		this.checkstatus = checkstatus;
		this.image = image;
	}
	public ItemDTO() {
	}
	
}
