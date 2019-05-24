package com.pack.dao;



import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.pack.HibernateUtil;
import com.pack.model.Customer;

public class CustomerDaoImpl implements CustomerDao  {

	public void insertCustomer(Customer customer) {
		Session s=HibernateUtil.getSessionFactory().openSession();
		Transaction t=null;
		try 
		{
			t=s.beginTransaction();
			s.save(customer);
			t.commit();
		}
		catch (HibernateException e) {
			// TODO: handle exception
			System.out.println("=-=>"+e);
			t.rollback();
			e.printStackTrace();
		}
		finally {
			s.close();
		}
		
	}

	public void upadteCustomer(Customer customer) {
		Session s=HibernateUtil.getSessionFactory().openSession();
		Transaction t=null;
		try 
		{
			t=s.beginTransaction();
			Customer c=(Customer)s.get(Customer.class, customer.getCustid());
			if(c!=null) 
			{
				c.setAddress(customer.getAddress());
				c.setAge(customer.getAge());
				c.setSalery(customer.getSalery());
				s.update(c);
			}
			else 
			{
				System.out.println("no customer found");
			}
			t.commit();
			
		}
		catch (HibernateException e) {
			// TODO: handle exception
			System.out.println("=-=>"+e);
			t.rollback();
			e.printStackTrace();
		}
		finally {
			s.close();
		}
		
		
	}

	public void deleteCustomer(int custid) {
		Session s=HibernateUtil.getSessionFactory().openSession();
		Transaction t=null;
		try 
		{
			t=s.beginTransaction();
			Customer c=(Customer)s.get(Customer.class, custid);
			if(c!=null) 
			{
				s.delete(c);
			}
			t.commit();
		}
		catch (HibernateException e) {
			// TODO: handle exception
			System.out.println("=-=>"+e);
			t.rollback();
			e.printStackTrace();
		}
		finally {
			s.close();
		}
	}

	public Customer fetchCustomerID(int custid) {
		Session s=HibernateUtil.getSessionFactory().openSession();
		Transaction t=null;
		Customer c=null;
		try 
		{
			t=s.beginTransaction();
			c=(Customer)s.get(Customer.class, custid);
			t.commit();			
		}
		catch (HibernateException e) {
			// TODO: handle exception
			System.out.println("=-=>"+e);
			t.rollback();
			e.printStackTrace();
		}
		finally {
			s.close();
		}
		
		return c;
	}

}
