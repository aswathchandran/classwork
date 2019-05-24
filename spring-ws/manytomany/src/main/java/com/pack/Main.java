package com.pack;

import java.util.HashSet;
import java.util.Set;



import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Main {

	public static void main(String[] args) {
		SessionFactory factory=new Configuration().configure().buildSessionFactory();
		Session session=factory.openSession();
		Transaction t=session.beginTransaction();
		
		Category c1=new Category();
		c1.setCatid(100);
		c1.setName("A");
		
		Category c2=new Category();
		c2.setCatid(101);
		c2.setName("B");
		
		
		Items i1=new Items();
		i1.setItemid(200);
		i1.setItemname("x");
		
		Items i2=new Items();
		i2.setItemid(200);
		i2.setItemname("y");

		Set s1=new HashSet();
		s1.add(i1);
		s1.add(i2);
		
		c1.setItems(s1);
		c2.setItems(s1);
		
		session.persist(c1);
		session.persist(c2);
		
		t.commit();
		session.close();
		
	}

}
