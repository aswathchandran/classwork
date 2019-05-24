package com.pack.dao;

import org.apache.log4j.Logger;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import com.pack.form.Customer;

@Repository
public class CustomerDoaImpl implements CustomerDao {
	private static Logger logger=Logger.getLogger(CustomerDoaImpl.class);
	
	private SessionFactory sessionFactory;
	
	

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Override
	public void addCustomer(Customer customer) {
		// TODO Auto-generated method stub
		logger.info("inside dao add customer");
		sessionFactory.getCurrentSession().save(customer);
	}

	@Override
	public void updateCustomer(Customer customer) {
		// TODO Auto-generated method stub

	}

}
