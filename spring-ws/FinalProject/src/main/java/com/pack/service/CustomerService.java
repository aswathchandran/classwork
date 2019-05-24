package com.pack.service;

import java.util.List;

import com.pack.form.Customer;

public interface CustomerService {

	public void addCustomer(Customer customer);
	public void updateCustomer(Customer customer);
	public List<Customer> listCustomer();
	public Customer getCustomerById(Integer cid);
	public void removeCustomer(Integer cid);
}
