package com.pack.service;

import java.util.List;

import com.pack.model.Customer;


public interface CustomerService {
	
	public int insertCustomer(Customer customer) ;
	
	public List<Customer> fetchCustomers();
	
	public Customer fetchCustomer(int customer_id);
	
	public int updateCustomer(Customer customer);

	public int deleteCustomer(int customer_id);
}
