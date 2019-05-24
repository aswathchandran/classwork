package com.pack;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Resource res=new ClassPathResource("beans.xml");
		BeanFactory factory=new XmlBeanFactory(res);
		
		HelloWorld hello=factory.getBean("helloWorld", HelloWorld.class);
		hello.getMessage();
		
		HelloWorld hello1=(HelloWorld)factory.getBean("helloWorld");
		hello1.getMessage();
		
	}

}
