package com.pack;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;


public class HibernateUtil {

	private static final SessionFactory sessionFactory;
	
	static 
	{
		try 
		{
			
				sessionFactory=new AnnotationConfiguration().configure().buildSessionFactory();
		}
		catch (Throwable e) {
			System.err.println(e);
			throw new ExceptionInInitializerError(e);
		}
		
	}
	
	
	public static SessionFactory getSessionFactory() 
	{
		return sessionFactory;
	}
	
}
