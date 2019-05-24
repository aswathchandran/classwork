package com.pack;



import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class Main {

	public static void main(String[] args) {
		SessionFactory sf=HibernateUtil.getSessionFactory();
		Session session=sf.openSession();
		Transaction transaction=session.beginTransaction();
		Student student=new Student();
		student.setStudentid(100);
		student.setStudent_name("aswath");
		student.setGroup("maths");
		
		Address address=new Address();
		address.setAddressId(101);
		address.setPlace("Chennai");
		address.setStudent(student);
		
		session.persist(address);
		transaction.commit();
		System.out.println("transaction sucessfull");
		session.close();		
	}

}
