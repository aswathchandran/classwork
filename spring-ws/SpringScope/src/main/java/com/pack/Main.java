package com.pack;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
		Sample sam=context.getBean("message", Sample.class);
		System.out.println(sam);
		
		Sample sam1=context.getBean("message", Sample.class);
		System.out.println(sam1);
		

	}

}
