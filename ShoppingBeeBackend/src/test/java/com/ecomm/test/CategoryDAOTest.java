package com.ecomm.test;
import static org.junit.Assert.assertEquals;


import static org.junit.Assert.assertNotNull;


import static org.junit.Assert.assertTrue;

import java.util.List;

import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test; 
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.ecomm.dao.CategoryDAO;

import com.ecomm.entity.Category;


public class CategoryDAOTest {
	static CategoryDAO categoryDAO;

	@BeforeClass
	public static void initialize()
	{
		AnnotationConfigApplicationContext appContext=new AnnotationConfigApplicationContext();
		appContext.scan("com.ecomm");	
		appContext.refresh();
		categoryDAO=(CategoryDAO)appContext.getBean("categoryDAO");
	}

	@Ignore
	@Test  
	public void addCategory()
	{
		Category category=new Category();
		category.setCategoryName("sports");
		category.setCategoryDesc("All sport items are available ");
		
		assertTrue("Problem in Inserting Category",categoryDAO.addCategory(category));
	}
	
	
	/*@Test
	public void updateCategory() {
		Category category=(Category)categoryDAO.getCategory(6);
		
	category.setCategoryName("Sports");
	category.setCategoryDesc("all sport items are avaialable ");
		
		assertEquals("Successfully updated a single Category in the table!",true,categoryDAO.updateCategory(category));
	}
	@Test
	public void deleteCategory() {
		Category category=(Category)categoryDAO.getCategory(8);
				
		assertEquals("Successfully deleted a single Category in the table!",true,categoryDAO.deleteCategory(category));
		
		
	}*/

	@Test
	public void getCategoryList()
	{
		List<Category> categoryList=(List<Category>)categoryDAO.getCategoryDetails();
		
		for(Category category:categoryList)
		{
			System.out.print("Category Name:"+category.getCategoryName());
			System.out.println("::::Category Desc:"+category.getCategoryDesc());
		}
	}
@Test
public void getcategoryTest()
{
	Category category=(Category)categoryDAO.getCategory(3);
	assertNotNull("category object not Found",category);
	System.out.println("category Name:"+category.getCategoryName());
	System.out.println("category Desc:"+category.getCategoryDesc());
}
	
	

}
