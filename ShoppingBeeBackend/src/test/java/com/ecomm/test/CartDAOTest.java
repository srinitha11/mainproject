package com.ecomm.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.util.List;

import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.ecomm.dao.CartDAO;

import com.ecomm.entity.Cart;

public class CartDAOTest {
	static CartDAO cartDAO;

	@BeforeClass
	public static void initialize()
	{
		AnnotationConfigApplicationContext appContext=new AnnotationConfigApplicationContext();
		appContext.scan("com.ecomm");	
		appContext.refresh();
		cartDAO=(CartDAO)appContext.getBean("cartDAO");
	}
@Ignore
	@Test  
	public void addCart()
	{
		Cart cart=new Cart();
		
		cart.setProductId(4);
		cart.setProductName("adidas");
		cart.setQuantity(1);
		cart.setTotalPrice(6000);
		cart.setUserName("shravya");
		
		assertTrue("Problem in Inserting Cart",cartDAO.addCart(cart));
	}
@Ignore
@Test
public void updateCart() {
	Cart cart=(Cart)cartDAO.getCart(2);
	
cart.setQuantity(1);
	
	assertEquals("Successfully updated a single Cart in the table!",true,cartDAO.updateCart(cart));
}
@Ignore
@Test
public void deleteCart() {
	Cart cart=(Cart)cartDAO.getCart(4);
			
	assertEquals("Successfully deleted a single Cart in the table!",true,cartDAO.deleteCart(cart));
	
	
}
	
	@Test
	public void getCartTest()
	{
		Cart cart=(Cart)cartDAO.getCart(3);
		assertNotNull("cart object not Found",cart);
		System.out.println("productId:"+cart.getProductId());
		System.out.println("productname:"+cart.getProductName());
		System.out.println("quantity:"+cart.getQuantity());
		System.out.println("Totalprice:"+cart.getTotalPrice());
		System.out.println("username:"+cart.getUserName());
	}
	
	@Test
	public void getCatgoryList()
	{
		List<Cart> cartList=(List<Cart>)cartDAO.getCartDetails();
		
		for(Cart cart:cartList)
		{
			System.out.println("productid:"+cart.getProductId());
			System.out.println("::productname:"+cart.getProductName());
			System.out.println("::qunatity:"+cart.getQuantity());
			System.out.println("::totalprice:"+cart.getTotalPrice());
			System.out.println("::username:"+cart.getUserName());
		}
	}

}
