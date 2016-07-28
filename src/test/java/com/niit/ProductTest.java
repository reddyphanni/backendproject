package com.niit;

import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.dao.ProductDAO;
import com.niit.models.Product;

public class ProductTest {

public static void main(String[] args) 
	{
		@SuppressWarnings("resource")
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.scan("com.niit");
		context.refresh();
		ProductDAO productDAO = (ProductDAO) context.getBean("productDAO");
		Product product = (Product) context.getBean("product");
		product.setId("TAB_004");
		product.setName("Tablet4");
		product.setDescription("Tablet product1");
		product.setPrice("10000");
		productDAO.saveOrUpdate(product);
		
		//productDAO.delete("TAB_004");
	
	
		List<Product>  list =    productDAO.list();
		
		for(Product cat : list)
		{
			System.out.println(cat.getId()  + ":" +  cat.getName()  + ":"+  cat.getDescription() + ":"+cat.getPrice());
		}
			
			

		
	}
}
