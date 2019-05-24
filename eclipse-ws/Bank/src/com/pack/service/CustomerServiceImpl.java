package com.pack.service;

import java.util.List;

import com.pack.dao.CustomerDaoImpl;
import com.pack.model.Customer;

public class CustomerServiceImpl implements CustomerService {

	CustomerDaoImpl customerDaoimpl=new CustomerDaoImpl();
	@Override
	public int insertCustomer(Customer customer) {
//		int i=new CustomerDaoImpl().insertCustomer(customer);
		
		
		int i=customerDaoimpl.insertCustomer(customer);
		return i;
	}

	@Override
	public List<Customer> fetchCustomers() {
		
		return customerDaoimpl.fetchCustomers();
	}

	@Override
	public Customer fetchCustomer(int customer_id) {
		
		return new CustomerDaoImpl().fetchCustomer(customer_id);
	}

	@Override
	public int updateCustomer(Customer customer) {

		return new CustomerDaoImpl().updateCustomer(customer);
	}

	@Override
	public int deleteCustomer(int customer_id) {

		return new CustomerDaoImpl().deleteCustomer(customer_id);
	}

	
}
