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
	private int tier;
	private String coupon;

}
