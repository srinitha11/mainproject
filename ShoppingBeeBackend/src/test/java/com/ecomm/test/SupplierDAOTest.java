package com.ecomm.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import static org.junit.Assert.assertTrue;

import java.util.List;

import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.ecomm.dao.SupplierDAO;
import com.ecomm.dao.SupplierDAO;

import com.ecomm.entity.Supplier;



public class SupplierDAOTest {
	static SupplierDAO supplierDAO;
	@BeforeClass
	public static void initialize()
	{
		AnnotationConfigApplicationContext appContext=new AnnotationConfigApplicationContext();
		appContext.scan("com.ecomm");	
		appContext.refresh();
		supplierDAO=(SupplierDAO)appContext.getBean("supplierDAO");
	}

	@Ignore
	@Test
	public void addSupplier()
	{
		Supplier supplier=new Supplier();
		supplier.setSupplierName("ramya");
		supplier.setSupplierDesc("supplyall");
		
		assertTrue("Problem in Inserting supplier",supplierDAO.addSupplier(supplier));
	}
	/*@Test
	public void updateSupplier() {
		Supplier supplier=(Supplier)supplierDAO.getSupplier(5);
		
	supplier.setSupplierName("madhu");
	supplier.setSupplierDesc("supply all");
		
		assertEquals("Successfully updated a single Supplier in the table!",true,supplierDAO.updateSupplier(supplier));
	}
	@Test
	public void deleteSupplier() {
		Supplier supplier=(Supplier)supplierDAO.getSupplier(6);
				
		assertEquals("Successfully deleted a single Category in the table!",true,supplierDAO.deleteSupplier(supplier));
		
	}	*/
	


	@Test
	public void getsupplierTest()
	{
		Supplier supplier=(Supplier)supplierDAO.getSupplier(2);
		assertNotNull("supplier object not Found",supplier);
		System.out.println("Supplier Name:"+supplier.getSupplierName());
		System.out.println("supplier Desc:"+supplier.getSupplierDesc());
	}
	@Test
	public void getSupplierList()
	{
		List<Supplier> supplierList=(List<Supplier>)supplierDAO.getsupplierDetails();
		
		for(Supplier supplier:supplierList)
		{
			System.out.print("Supplier Name:"+supplier.getSupplierName());
			System.out.println("::::SupplierDesc:"+supplier.getSupplierDesc());
		}
			
	        
		
	}
}



