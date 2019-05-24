package com.pack;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
		
		InjectCollection inj=context.getBean("collection", InjectCollection.class);
		
		
		System.out.println(inj.getName1());
		System.out.println(inj.getName2());
		System.out.println(inj.getName3());
		System.out.println(inj.getName4());

	}

}
