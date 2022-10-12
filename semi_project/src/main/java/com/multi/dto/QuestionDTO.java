package com.multi.dto;

import java.util.Date;

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
public class QuestionDTO {
	
	private int questionid;
	private String custid;
	private int itemid;
	private String qcontent;
	private String astatus;
	private Date qdate;
	
}
