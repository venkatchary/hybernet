package com.sathya.entity;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;

@Entity
public class CustomerLoan {
	@EmbeddedId
	private  CustomerLoanPK   pk;
	private  Double  maxAmount;
	private  Double  usedAmount;
	private  Integer tenure;
	public CustomerLoanPK getPk() {
		return pk;
	}
	public void setPk(CustomerLoanPK pk) {
		this.pk = pk;
	}
	public Double getMaxAmount() {
		return maxAmount;
	}
	public void setMaxAmount(Double maxAmount) {
		this.maxAmount = maxAmount;
	}
	public Double getUsedAmount() {
		return usedAmount;
	}
	public void setUsedAmount(Double usedAmount) {
		this.usedAmount = usedAmount;
	}
	public Integer getTenure() {
		return tenure;
	}
	public void setTenure(Integer tenure) {
		this.tenure = tenure;
	}

}
