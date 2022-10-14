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
public class PurchaseDTO {
	private int purchaseid;
	private String custid;
	private String name;
	private String receiver;
	private String address;
	private String number;
	private String pay;
	private int totalprice;
	public int getPurchaseid() {
		return purchaseid;
	}
	public void setPurchaseid(int purchaseid) {
		this.purchaseid = purchaseid;
	}
	public String getCustid() {
		return custid;
	}
	public void setCustid(String custid) {
		this.custid = custid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getReceiver() {
		return receiver;
	}
	public void setReceiver(String receiver) {
		this.receiver = receiver;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public String getPay() {
		return pay;
	}
	public void setPay(String pay) {
		this.pay = pay;
	}
	public int getTotalprice() {
		return totalprice;
	}
	public void setTotalprice(int totalprice) {
		this.totalprice = totalprice;
	}
	@Override
	public String toString() {
		return "PurchaseDTO [purchaseid=" + purchaseid + ", custid=" + custid + ", name=" + name + ", receiver="
				+ receiver + ", address=" + address + ", number=" + number + ", pay=" + pay + ", totalprice="
				+ totalprice + "]";
	}
	public PurchaseDTO(int purchaseid, String custid, String name, String receiver, String address, String number,
			String pay, int totalprice) {
		super();
		this.purchaseid = purchaseid;
		this.custid = custid;
		this.name = name;
		this.receiver = receiver;
		this.address = address;
		this.number = number;
		this.pay = pay;
		this.totalprice = totalprice;
	}
	public PurchaseDTO() {
	}
	
}
