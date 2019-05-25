package com.sathya.entity;

import java.io.Serializable;

import javax.persistence.Embeddable;
@Embeddable
public class CustomerLoanPK implements Serializable {
	private  Integer  customerId;
	private  Integer  loanId;
	public Integer getCustomerId() {
		return customerId;
	}
	public void setCustomerId(Integer customerId) {
		this.customerId = customerId;
	}
	public Integer getLoanId() {
		return loanId;
	}
	public void setLoanId(Integer loanId) {
		this.loanId = loanId;
	}
	
	

}
