package com.pack.dao;

import java.util.List;

import com.pack.form.Customer;

public interface CustomerDao {
	
	public void addCustomer(Customer customer);
	public void updateCustomer(Customer customer);
	public List<Customer> listCustomer();
	public Customer getCustomerById(Integer cid);
	public void removeCustomer(Integer cid);
}
