package com.ecomm.dao;

import java.util.List
;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.ecomm.entity.Category;
import com.ecomm.entity.Customer;
import com.ecomm.entity.Customer;


@Transactional
@Repository("customerDAO")
public class CustomerDAOImpl  implements CustomerDAO{
	@Autowired
	SessionFactory sessionFactory;

	public boolean addCustomer(Customer customer) {
		try{
			Session session=sessionFactory.getCurrentSession();
			session.save(customer);
			return true;
		}
		catch(Exception e){
			System.out.println("Exception Arised:"+e);
			return false;
		}
		
	}
	
	public boolean deleteCustomer(Customer customer) {
		try{
			Session session=sessionFactory.getCurrentSession();
			session.delete(customer);
			return true;
		}
		catch(Exception e)
		{
			return false;
		}
	}

	@Override
	public boolean updateCustomer(Customer customer) {
		try{
			Session session=sessionFactory.getCurrentSession();
			session.update(customer);
			return true;
		}
		catch(Exception e)
		{
			return false;
		}
	}

	@Override
	public List<Customer> getCustomerDetails() {
		Session session=sessionFactory.getCurrentSession();
		List<Customer> customerList=session.createQuery("from Customer").list();
		return customerList;
	}

	@Override
	public Customer getCustomer(int customerId) {
		Session session=sessionFactory.getCurrentSession();
		Customer customer=(Customer)session.get(Customer.class, customerId);
		return customer;
	}
}


