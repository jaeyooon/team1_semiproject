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
public class AddrDTO {
	private int addrid;
	private String custid;
	private String addrname;
	private String receiver;
	private String address;
	private String tel;
	public int getAddrid() {
		return addrid;
	}
	public void setAddrid(int addrid) {
		this.addrid = addrid;
	}
	public String getCustid() {
		return custid;
	}
	public void setCustid(String custid) {
		this.custid = custid;
	}
	public String getAddrname() {
		return addrname;
	}
	public void setAddrname(String addrname) {
		this.addrname = addrname;
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
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	@Override
	public String toString() {
		return "AddrDTO [addrid=" + addrid + ", custid=" + custid + ", addrname=" + addrname + ", receiver=" + receiver
				+ ", address=" + address + ", tel=" + tel + "]";
	}
	public AddrDTO(int addrid, String custid, String addrname, String receiver, String address, String tel) {
		super();
		this.addrid = addrid;
		this.custid = custid;
		this.addrname = addrname;
		this.receiver = receiver;
		this.address = address;
		this.tel = tel;
	}
	public AddrDTO() {
	}
	
}
