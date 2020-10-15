package com.ecomm.dao;

import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.ecomm.entity.Cart;
@Transactional
@Repository("cartDAO")

public class CartDAOImpl implements CartDAO 
{
	@Autowired
	SessionFactory sessionFactory;
	public boolean addCart(Cart cart) {
		try{
			Session session=sessionFactory.getCurrentSession();
			session.save(cart);
			return true;
		}
		catch(Exception e){
			System.out.println("Exception Arised:"+e);
			return false;
		}
	}
	
	

	public boolean deleteCart(Cart cart) {
		try{
			Session session=sessionFactory.getCurrentSession();
			session.delete(cart);
			return true;
		}
		catch(Exception e){
			System.out.println("Exception Arised:"+e);
			return false;
		}
	}
			

	public boolean updateCart(Cart cart) {
		try{
			Session session=sessionFactory.getCurrentSession();
			session.update(cart);
			return true;
		}
		catch(Exception e){
			System.out.println("Exception Arised:"+e);
			return false;
		}	
	}

	public List<Cart> getCartDetails() {
		Session session=sessionFactory.getCurrentSession();
		List<Cart> cartList=session.createQuery("from Cart").list();
		return cartList;
	}

	public Cart getCart(int cartId) {
		Session session=sessionFactory.getCurrentSession();
		Cart cart=(Cart)session.get(Cart.class, cartId);
		return cart;
	}
		
	}


