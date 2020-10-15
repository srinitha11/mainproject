package com.ecomm.dao;

import java.util.List;



import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.ecomm.entity.Supplier;

@Transactional
@Repository("supplierDAO")
public class SupplierDAOImpl implements SupplierDAO {
	@Autowired
	SessionFactory sessionFactory;

	public boolean addSupplier(Supplier supplier) {
		try{
			Session session=sessionFactory.getCurrentSession();
			session.save(supplier);
			return true;
		}
		catch(Exception e){
			System.out.println("Exception Arised:"+e);
			return false;
		}
		
	}
	public boolean deleteSupplier(Supplier supplier) {
		try{
			Session session=sessionFactory.getCurrentSession();
			session.delete(supplier);
			return true;
		}
		catch(Exception e)
		{
			return false;
		}
	}


	public boolean updateSupplier(Supplier supplier) {
		try{
			Session session=sessionFactory.getCurrentSession();
			session.update(supplier);
			return true;
		}
		catch(Exception e)
		{
			return false;
		}
	}
	  
	

	public List<Supplier> getsupplierDetails() {
		Session session=sessionFactory.getCurrentSession();
		List<Supplier> SupplierList=session.createQuery("from Supplier").list();
		return SupplierList;
		
	}

	public Supplier getSupplier(int supplierId) {
		Session session=sessionFactory.getCurrentSession();
		Supplier supplier=(Supplier)session.get(Supplier.class, supplierId);
		return supplier;
		
	}


	


}
