package com.ecomm.dao;

import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.ecomm.entity.Category;
import com.ecomm.entity.Category;


@Transactional
@Repository("categoryDAO")
public class CategoryDAOImpl  implements CategoryDAO{
	@Autowired
	SessionFactory sessionFactory;

	public boolean addCategory(Category category) {
		try{
			Session session=sessionFactory.getCurrentSession();
			session.save(category);
			return true;
		}
		catch(Exception e){
			System.out.println("Exception Arised:"+e);
			return false;
		}
		
	}
	public boolean deleteCategory(Category category) {
		try{
			Session session=sessionFactory.getCurrentSession();
			session.delete(category);
			return true;
		}
		catch(Exception e)
		{
			return false;
		}
	}

	public boolean updateCategory(Category category) {
		try{
			Session session=sessionFactory.getCurrentSession();
			session.update(category);
			return true;
		}
		catch(Exception e)
		{
			return false;
		}
	}
	public List<Category> getCategoryDetails()
	{
		Session session=sessionFactory.getCurrentSession();
		List<Category> CategoryList=session.createQuery("from Category").list();
		return CategoryList;
	}

	public Category getCategory(int CategoryId) {
		Session session=sessionFactory.getCurrentSession();
		Category Category=(Category)session.get(Category.class, CategoryId);
		return Category;
	}
}

	