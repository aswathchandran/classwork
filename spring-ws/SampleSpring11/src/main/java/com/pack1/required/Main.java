package com.pack1.required;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String a[]) {
	ApplicationContext context=new ClassPathXmlApplicationContext("beans1.xml");
	
	User user=context.getBean("user",User.class);
	
	
	System.out.println(user);
	}


}
