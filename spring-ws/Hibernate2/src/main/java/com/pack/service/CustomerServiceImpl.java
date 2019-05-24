package com.pack.service;

import java.util.List;

import com.pack.dao.CustomerDaoImpl;
import com.pack.model.Customer;

public class CustomerServiceImpl implements CustomerService {

	public void insertCustomer(Customer customer) {
		new CustomerDaoImpl().insertCustomer(customer);
	}

	public void updateCustomer(Customer customer) {
		// TODO Auto-generated method stub
		new CustomerDaoImpl().upadteCustomer(customer);
	}

	public void deleteCustomer(int custid) {
		// TODO Auto-generated method stub
		new CustomerDaoImpl().deleteCustomer(custid);
	}

	public List<Customer> fetchCustomerID() {
		
		return new CustomerDaoImpl().fetchCustomerID();
	}

}
