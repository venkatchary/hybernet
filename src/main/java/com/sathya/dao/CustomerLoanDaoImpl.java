package com.sathya.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.sathya.entity.CustomerLoan;
import com.sathya.entity.CustomerLoanPK;
import com.sathya.util.HibernateUtil;

public class CustomerLoanDaoImpl implements CustomerLoanDao {
	private  SessionFactory  factory;
	public CustomerLoanDaoImpl() {
		factory=HibernateUtil.getSessionFactory();
	}

	public void saveEntity(CustomerLoan cl) {
		Session  session=factory.openSession();
		Transaction tx=session.beginTransaction();
		session.save(cl);
		tx.commit();
		session.close();
		System.out.println("Object is stored");
	}

	public CustomerLoan getEntity(CustomerLoanPK pk) {
		Session  session=factory.openSession();
		CustomerLoan  cl=(CustomerLoan)session.get(CustomerLoan.class, pk);
		session.close();
		return  cl;
	}
}
