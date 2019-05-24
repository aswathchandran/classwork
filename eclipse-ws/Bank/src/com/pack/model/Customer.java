package com.pack.model;

public class Customer {
	
	
	
	private String customer_name,address,city;
	private int customer_id;
	private float salery;
	
	
	public Customer(int customer_id,String customer_name, String address, String city,  float salery) {
		super();
		this.customer_name = customer_name;
		this.address = address;
		this.city = city;
		this.customer_id = customer_id;
		this.salery = salery;
	}
	
	
	
	
	
	public Customer( int customer_id,String address, float salery, String city) {
		super();
		this.address = address;
		this.city = city;
		this.customer_id = customer_id;
		this.salery = salery;
	}





	public Customer() {
		// TODO Auto-generated constructor stub
	}
	

	
	public String getCustomer_name() {
		return customer_name;
	}
	public void setCustomer_name(String customer_name) {
		this.customer_name = customer_name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public int getCustomer_id() {
		return customer_id;
	}
	public void setCustomer_id(int customer_id) {
		this.customer_id = customer_id;
	}
	public float getSalery() {
		return salery;
	}
	public void setSalery(float salery) {
		this.salery = salery;
	}
	

}
