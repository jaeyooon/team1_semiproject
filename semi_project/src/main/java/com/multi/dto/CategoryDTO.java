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

public class CategoryDTO {
	private int cateid;
	private int topid;
	private String catename;
	public int getCateid() {
		return cateid;
	}
	public void setCateid(int cateid) {
		this.cateid = cateid;
	}
	public int getTopid() {
		return topid;
	}
	public void setTopid(int topid) {
		this.topid = topid;
	}
	public String getCatename() {
		return catename;
	}
	public void setCatename(String catename) {
		this.catename = catename;
	}
	@Override
	public String toString() {
		return "CategoryDTO [cateid=" + cateid + ", topid=" + topid + ", catename=" + catename + "]";
	}
	public CategoryDTO(int cateid, int topid, String catename) {
		super();
		this.cateid = cateid;
		this.topid = topid;
		this.catename = catename;
	}
	public CategoryDTO() {
	}
	
}
