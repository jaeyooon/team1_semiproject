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
public class CustomerDTO {

	private String custid;
	private String pwd;
	private String name;
	private String tel;
	private String birth;
	private String gender;
	private String address;
	public String getCustid() {
		return custid;
	}
	public void setCustid(String custid) {
		this.custid = custid;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String getBirth() {
		return birth;
	}
	public void setBirth(String birth) {
		this.birth = birth;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "CustomerDTO [custid=" + custid + ", pwd=" + pwd + ", name=" + name + ", tel=" + tel + ", birth=" + birth
				+ ", gender=" + gender + ", address=" + address + "]";
	}
	public CustomerDTO(String custid, String pwd, String name, String tel, String birth, String gender,
			String address) {
		super();
		this.custid = custid;
		this.pwd = pwd;
		this.name = name;
		this.tel = tel;
		this.birth = birth;
		this.gender = gender;
		this.address = address;
	}
	public CustomerDTO() {
		
	}
	

}
