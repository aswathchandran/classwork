package com.pack;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
		
		User user=(User)context.getBean("user1");
		System.out.println(user);
				

	}

}
	