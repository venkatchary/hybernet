package com.sathya.test;

import com.sathya.dao.CustomerLoanDao;
import com.sathya.dao.CustomerLoanDaoImpl;
import com.sathya.entity.CustomerLoan;
import com.sathya.entity.CustomerLoanPK;

public class Test {
	public static void main(String arggs[]) {
		CustomerLoanDao  dao = new  CustomerLoanDaoImpl();
		
		CustomerLoanPK  pk=new CustomerLoanPK();
		pk.setCustomerId(7001);
		pk.setLoanId(101);
		
		CustomerLoan cl = dao.getEntity(pk);
		System.out.println("Used amount : "+cl.getUsedAmount());
		System.out.println("Tenure : "+cl.getTenure());
		
		
		/*CustomerLoan  cl =new CustomerLoan();
		cl.setPk(pk);
		cl.setMaxAmount(500000.00);
		cl.setUsedAmount(300000.00);
		cl.setTenure(10);
		
		dao.saveEntity(cl);*/
		
		
	}

}
