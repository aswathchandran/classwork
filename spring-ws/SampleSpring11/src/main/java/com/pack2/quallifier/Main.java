package com.pack2.quallifier;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String a[]) {
	ApplicationContext context=new ClassPathXmlApplicationContext("beans3.xml");
	
	Sample sample=context.getBean("sample",Sample.class);
		sample.display();
		sample.display1();
	}


}
