package com.aswath.model;

public class LoginModel {

	private String username,password;

	
	public LoginModel() {
		
	}
	
	
	public LoginModel(String username, String password) {
		super();
		
		System.out.println("Login model Paramaterized constructor --->value initilised");
		this.username = username;
		this.password = password;
		System.out.println(this.username);
		System.out.println(this.password);
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	
	
	
	



}
