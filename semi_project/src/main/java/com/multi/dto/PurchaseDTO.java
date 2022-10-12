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

}
