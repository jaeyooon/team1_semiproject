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
	public int getQuestionid() {
		return questionid;
	}
	public void setQuestionid(int questionid) {
		this.questionid = questionid;
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
	public String getQcontent() {
		return qcontent;
	}
	public void setQcontent(String qcontent) {
		this.qcontent = qcontent;
	}
	public String getAstatus() {
		return astatus;
	}
	public void setAstatus(String astatus) {
		this.astatus = astatus;
	}
	public Date getQdate() {
		return qdate;
	}
	public void setQdate(Date qdate) {
		this.qdate = qdate;
	}
	@Override
	public String toString() {
		return "QuestionDTO [questionid=" + questionid + ", custid=" + custid + ", itemid=" + itemid + ", qcontent="
				+ qcontent + ", astatus=" + astatus + ", qdate=" + qdate + "]";
	}
	public QuestionDTO(int questionid, String custid, int itemid, String qcontent, String astatus, Date qdate) {
		super();
		this.questionid = questionid;
		this.custid = custid;
		this.itemid = itemid;
		this.qcontent = qcontent;
		this.astatus = astatus;
		this.qdate = qdate;
	}
	public QuestionDTO() {
	}
	
}
