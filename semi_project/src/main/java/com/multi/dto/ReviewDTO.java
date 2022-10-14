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
	public int getReviewid() {
		return reviewid;
	}
	public void setReviewid(int reviewid) {
		this.reviewid = reviewid;
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
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getImg() {
		return img;
	}
	public void setImg(String img) {
		this.img = img;
	}
	public int getRate() {
		return rate;
	}
	public void setRate(int rate) {
		this.rate = rate;
	}
	@Override
	public String toString() {
		return "ReviewDTO [reviewid=" + reviewid + ", custid=" + custid + ", itemid=" + itemid + ", content=" + content
				+ ", img=" + img + ", rate=" + rate + "]";
	}
	public ReviewDTO(int reviewid, String custid, int itemid, String content, String img, int rate) {
		super();
		this.reviewid = reviewid;
		this.custid = custid;
		this.itemid = itemid;
		this.content = content;
		this.img = img;
		this.rate = rate;
	}
	public ReviewDTO() {
	}
	
}
