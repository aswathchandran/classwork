package com.pack.dao;

import java.util.List;

import org.apache.log4j.Logger;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import com.pack.form.Customer;

@Repository
public class CustomerDoaImpl implements CustomerDao {
	private static Logger logger=Logger.getLogger(CustomerDoaImpl.class);
	
	private SessionFactory sessionFactory;
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Override
	public void addCustomer(Customer customer) {
		// TODO Auto-generated method stub
		logger.info("inside dao add customer");
		sessionFactory.getCurrentSession().save(customer);
	}

	@Override
	public void updateCustomer(Customer customer) {
		sessionFactory.getCurrentSession().update(customer);

	}

	@Override
	public List<Customer> listCustomer() {
		
		//List<Customer> list=null;
		Query query=sessionFactory.getCurrentSession().createQuery("from Customer");
		List list=query.list();
		return list;
	}

	@Override
	public Customer getCustomerById(Integer cid) {
		Query q=sessionFactory.getCurrentSession().createQuery("from Customer c where c.id=:id");
		q.setParameter("id", cid);
		Customer c=(Customer)q.uniqueResult();
		return c;
	}

	@Override
	public void removeCustomer(Integer cid) {
		Customer c=(Customer)sessionFactory.getCurrentSession().get(Customer.class, cid);
		if(c!=null) 
		{
			sessionFactory.getCurrentSession().delete(c);
		}
		
	}

}
