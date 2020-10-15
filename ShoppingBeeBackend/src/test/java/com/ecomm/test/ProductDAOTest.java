package com.ecomm.test;


import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;


import static org.junit.Assert.assertTrue;

import java.util.List;

import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.ecomm.dao.ProductDAO;
import com.ecomm.dao.ProductDAO;
import com.ecomm.entity.Product;
import com.ecomm.entity.Product;
public class ProductDAOTest {
	static ProductDAO productDAO;
	@BeforeClass
	public static void initialize()
	{
		AnnotationConfigApplicationContext appContext=new AnnotationConfigApplicationContext();
		appContext.scan("com.ecomm");	
		appContext.refresh();
		productDAO=(ProductDAO)appContext.getBean("productDAO");
	}
	@Ignore
	@Test
	public void addProduct()
	{
		Product product=new Product();
		
		product.setProductName("Applemobile");
		product.setProductDesc("It combines ipad and digitalcamera");
		product.setCategoryId(2);
		product.setSupplierId(2);
		product.setPrice(2000);
		assertTrue("Problem in Inserting Product",productDAO.addProduct(product));
	}

	/*@Test
	public void deleteCategory() {
		Product product=(Product)productDAO.getProduct(8);
				
		assertEquals("Successfully deleted a single Category in the table!",true,productDAO.deleteProduct(product));
	}


@Test
public void updateCategory() {
	Product product=(Product)productDAO.getProduct(6);
	
product.setProductName("badmintonracket");
product.setProductDesc("best racket");
	
	assertEquals("Successfully updated a single Category in the table!",true,productDAO.updateProduct(product));
}*/

	@Test
	public void getProductTest()
	{
		Product product=(Product)productDAO.getProduct(3);
		assertNotNull("product object not Found",product);
		System.out.println("Product Name:"+product.getProductName());
		System.out.println("Product Desc:"+product.getProductDesc());
		System.out.println("ProductId :"+product.getProductId());
		System.out.println("supplierId:"+product.getSupplierId());
		System.out.println("Price:"+product.getPrice());
		
	}

	@Test
	public void getProductList()
	{
		List<Product> productList=(List<Product>)productDAO.getproductDetails();
		
		for(Product product:productList)
		{
			System.out.print("Product Name:"+product.getProductName());
			System.out.println("::Product Desc:"+product.getProductDesc());
			System.out.print("::categoryid:"+product.getCategoryId());
			System.out.println("::supplierId"+product.getSupplierId());
			System.out.print("::Price:"+product.getPrice());
			
		}
		
	}
}

	

	
	

