package com.pack;



import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class Main {

	public static void main(String[] args) {
		SessionFactory sf=HibernateUtil.getSessionFactory();
		
		Session s=sf.openSession();
		
		Transaction t=s.beginTransaction();
		
		Employee e1=new Employee();
		e1.setName("aswath");
		RegularEmployee e2=new RegularEmployee();
		e2.setSalery(20000);
		e2.setBonus(1000);
		e2.setName("bhanu");
		ContractEmployee e3=new ContractEmployee();
		e3.setName("bhanu");
		e3.setPay_hour(10);
		e3.setContract_duration("2 hr");
		
		s.persist(e1);
		s.persist(e2);
		s.persist(e3);
		t.commit();
		System.out.println("sucessfully inserted");
		s.close();
	}

}
