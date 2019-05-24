package com.pack;


import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		
		
		AbstractApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
		
		
		HelloWorld hs=(HelloWorld)context.getBean("helloWorld");
		
		System.out.println(hs.getMessage());
		
		
		context.registerShutdownHook();
		
		

	}

}
