package com.pack;

import org.springframework.beans.factory.annotation.Autowired;

public class FirstBean {
		
		
		private SecondBean secondBean;
		@Autowired
		public FirstBean(SecondBean secondbean) {
			this.secondBean=secondbean;
			System.out.println("first bean object");
		}
		
		public void check() 
		{
			secondBean.check1();
		}
		

		
}
