package com.pack2.quallifier;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Sample {
	
	@Autowired
	@Qualifier("user1")
	private User user;
	
	public Sample() {
		System.out.println("Sample default");
	}
	
	public void display() 
	{
		System.out.println(user.getName());
	}
	
	public void display1() 
	{
		System.out.println(user.getAge());
	}




}
