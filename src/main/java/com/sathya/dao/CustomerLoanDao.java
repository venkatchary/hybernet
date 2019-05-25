package com.sathya.dao;

import com.sathya.entity.CustomerLoan;
import com.sathya.entity.CustomerLoanPK;

public interface CustomerLoanDao {
	void  saveEntity(CustomerLoan  cl);
	CustomerLoan    getEntity(CustomerLoanPK pk);
}
