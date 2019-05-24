package com.pack.service;

import com.pack.model.Customer;

public interface CustomerService {
	
	public  void insertCustomer(Customer customer);
	public void updateCustomer(Customer customer);
	
	public void deleteCustomer(int custid);
	
	public Customer fetchCustomerID(int custid);
	
}
