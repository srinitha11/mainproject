package com.ecomm.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.ecomm.entity.OrderDetails;
import com.ecomm.entity.OrderDetails;
import com.ecomm.entity.OrderDetails;
import com.ecomm.entity.OrderDetails;
@Transactional
@Repository("orderDAO")
public class OrderDAOImpl implements OrderDAO{
	@Autowired
	SessionFactory sessionFactory;
	public boolean addOrder(OrderDetails order) {
		try{
			Session session=sessionFactory.getCurrentSession();
			session.save(order);
			return true;
		}
		catch(Exception e){
			System.out.println("Exception Arised:"+e);
			return false;
		}
		
	}
	public boolean deleteOrder(OrderDetails order) {
		try{
			Session session=sessionFactory.getCurrentSession();
			session.delete(order);
			return true;
		}
		catch(Exception e)
		{
			return false;
		}
	}

	public boolean updateOrder(OrderDetails order) {
		try{
			Session session=sessionFactory.getCurrentSession();
			session.update(order);
			return true;
		}  
		catch(Exception e)
		{
			return false;
		}
	}
	public List<OrderDetails> getOrderDetails()
	{
		Session session=sessionFactory.getCurrentSession();
		List<OrderDetails> OrderList=session.createQuery("from OrderDetails").list();
		return OrderList;
	}

	public OrderDetails getOrder(int OrderId) {
		Session session=sessionFactory.getCurrentSession();
		OrderDetails Order=(OrderDetails)session.get(OrderDetails.class, OrderId);
		return Order;
	}
}

	
	
	