package com.pack;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String a[]) {
	ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
	
	FirstBean first=context.getBean("bean1",FirstBean.class);
	first.check();
	}


}
