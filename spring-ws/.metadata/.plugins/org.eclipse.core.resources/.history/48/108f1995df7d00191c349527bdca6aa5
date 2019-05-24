package com.pack.service;



import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.pack.dao.CustomerDao;
import com.pack.form.Customer;
@Service
public class CustomerServiceImpl implements CustomerService {
	private static Logger logger=Logger.getLogger(CustomerServiceImpl.class);
	
	
	private CustomerDao customerDao;
	
	@Autowired
	public void setCustomerDao(CustomerDao customerDao) {
		this.customerDao = customerDao;
	}

	@Transactional
	public void addCustomer(Customer customer) {
		// TODO Auto-generated method stub
		logger.info("inside service add customer");
		
		customerDao.addCustomer(customer);
	}

	@Override
	public void updateCustomer(Customer customer) {
		// TODO Auto-generated method stub
		logger.info("inside service update customer");

	}

}
