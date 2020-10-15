package com.ecomm.test;
import static org.junit.Assert.assertEquals;



import static org.junit.Assert.assertNotNull;


import static org.junit.Assert.assertTrue;

import java.util.List;

import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test; 
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


import com.ecomm.dao.OrderDAO;

import com.ecomm.entity.OrderDetails;



public class OrderDAOTest {
	static OrderDAO orderDAO;

	@BeforeClass
	public static void initialize()
	{
		AnnotationConfigApplicationContext appContext=new AnnotationConfigApplicationContext();
		appContext.scan("com.ecomm");	
		appContext.refresh();
		orderDAO=(OrderDAO)appContext.getBean("orderDAO");
	}
	@Ignore
	@Test  
	public void addOrder()
	{
		OrderDetails order=new OrderDetails();
		order.setUsername("shravya");
		order.setAmount(20000);
		
		assertTrue("Problem in Inserting Order",orderDAO.addOrder(order));
	}
	@Ignore
	@Test
	public void updateOrder() {
		OrderDetails order=(OrderDetails)orderDAO.getOrder(2);
		
	order.setAmount(25000);
		
		assertEquals("Successfully updated a single Order in the table!",true,orderDAO.updateOrder(order));
	}
	@Ignore
	@Test
	public void deleteOrder() {
		OrderDetails order=(OrderDetails)orderDAO.getOrder(4);
				
		assertEquals("Successfully deleted a single Order in the table!",true,orderDAO.deleteOrder(order));
		
		
	}
	
	@Test
	public void getorderTest()
	{
		OrderDetails order=(OrderDetails)orderDAO.getOrder(3);
		assertNotNull("order object not Found",order);
		System.out.println("order Name:"+order.getUsername());
		System.out.println("order Desc:"+order.getAmount());
	}
	@Test
	public void getOrderList()
	{
		List<OrderDetails> orderList=(List<OrderDetails>)orderDAO.getOrderDetails();
		
		for(OrderDetails order:orderList)
		{
			System.out.print("Order Name:"+order.getUsername());
			System.out.println("::::Order Desc:"+order.getAmount());
		}
	}
}
