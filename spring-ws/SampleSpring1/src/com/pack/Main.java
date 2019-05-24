package com.pack;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Resource res=new FileSystemResource("beans.xml");
		//BeanFactory factory=new XmlBeanFactory(res);		
		
		ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
		
		HelloWorld hello=context.getBean("helloWorld", HelloWorld.class);
		hello.getMessage();
		
		HelloWorld hello1=(HelloWorld)context.getBean("helloWorld");
		hello1.getMessage();
		
	}

}
