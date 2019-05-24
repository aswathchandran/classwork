package com.aswath.model;

public class VendorModel {
	
	
	private int vendorid;
	private String username;
	private String contact;
	private String address;
	private String password;
	
	public VendorModel() {
		// TODO Auto-generated constructor stub
	}
	
	
	

	public int getVendorid() {
		return vendorid;
	}




	public void setVendorid(int vendorid) {
		this.vendorid = vendorid;
	}




	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public VendorModel(int id, String username, String contact, String address, String password) {
		super();
		this.vendorid = id;
		this.username = username;
		this.contact = contact;
		this.address = address;
		this.password = password;
	}
	public VendorModel(String username, String password) {
		super();
		this.username = username;
		this.password = password;
	}
	
	
	

}
