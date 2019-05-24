package com.pack;

public class HelloWorld 
{

	private String message;

	public HelloWorld() {
		System.out.println("object crated");
	}
	public void getMessage() {
		System.out.println("Your message: "+message);
	}

	public void setMessage(String message) {
		this.message = message;
	}
}

