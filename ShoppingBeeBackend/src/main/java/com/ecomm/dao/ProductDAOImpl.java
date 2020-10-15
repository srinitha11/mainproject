package com.ecomm.dao;

import java.util.List;



import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.ecomm.entity.Product;
 @Transactional
 @Repository("productDAO")
public class ProductDAOImpl implements ProductDAO{
	@Autowired
	SessionFactory sessionFactory;
	public boolean addProduct(Product product) {
		try{
			Session session=sessionFactory.getCurrentSession();
			session.save(product);
			return true;
		}
		catch(Exception e){
			System.out.println("Exception Arised:"+e);
			return false;
		}
	}

	public boolean deleteProduct(Product product) {
		try{
			Session session=sessionFactory.getCurrentSession();
			session.delete(product);
			return true;
		}
		catch(Exception e){
			System.out.println("Exception Arised:"+e);
			return false;
		}
	}
	public boolean updateProduct(Product product) {
		try{
			Session session=sessionFactory.getCurrentSession();
			session.update(product);
			return true;
		}
		catch(Exception e){
			System.out.println("Exception Arised:"+e);
			return false;
		}
		
	}


	public List<Product> getproductDetails()
	{
		Session session=sessionFactory.getCurrentSession();
		List<Product> ProductList=session.createQuery("from Product").list();
		return ProductList;
	}

	public Product getProduct(int productId) {
		Session session=sessionFactory.getCurrentSession();
		Product product=(Product)session.get(Product.class, productId);
		return product;
	}

	
}
