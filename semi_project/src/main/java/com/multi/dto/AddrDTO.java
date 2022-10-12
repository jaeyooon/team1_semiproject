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
}
