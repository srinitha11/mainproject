
package com.ecomm.test;

import static org.junit.Assert.assertNotNull;


import static org.junit.Assert.assertTrue;

import java.util.List;

import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test; 
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.ecomm.dao.CustomerDAO;
import com.ecomm.dao.CustomerDAO;
import com.ecomm.entity.Customer;
public class CustomerDAOTest {
	static CustomerDAO customerDAO;
	@BeforeClass
	public static void initialize()
	{
		AnnotationConfigApplicationContext appContext=new AnnotationConfigApplicationContext();
		appContext.scan("com.ecomm");	
		appContext.refresh();
		customerDAO=(CustomerDAO)appContext.getBean("customerDAO");
	}
	
	@Test
	public void addCustomer()  
	{
		Customer customer=new Customer();
		
		customer.setUserName("pathu");
		customer.setPassword("pathu123");
		customer.setCustomerName("prathyusha");
		customer.setEmailId("pathu@gmail.com");
		customer.setMobileNo("8979182278");
		customer.setAddress("karimnagar");
		customer.setEnabled(true);
		
		
		assertTrue("Problem in Inserting Customer",customerDAO.addCustomer(customer));
	}
	
	
	/*@Test
	public void getCustomerTest()
	{
		Customer customer=(Customer)customerDAO.getUserName("sri");
		assertNotNull("customer object not Found",customer);
		System.out.println("Password:-"+customer.getPassword());
		System.out.println("CustomerName:-"+customer.getCustomerName());
		System.out.println("EmailId:-"+customer.getEmailId());
		System.out.println("Mobileno:-"+customer.getMobileNo());
		System.out.println("Address:-"+customer.getAddress());
	
	}
	
	@Test
	public void getCatgoryList()
	{
		List<Customer> customerList=(List<Customer>)customerDAO.getCustomerDetails();
		
		for(Customer customer:customerList)
		{
			System.out.print("Password:-  "+customer.getPassword());
			System.out.print(" Customer Name:-  "+customer.getCustomerName());
			System.out.print(" EmailId:-  "+customer.getEmailId());
			System.out.print(" mobileno:-  "+customer.getMobileNo());
			System.out.print(" Address:-  "+customer.getAddress());
	
		}
	}*/
}
