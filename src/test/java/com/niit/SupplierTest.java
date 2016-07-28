package com.niit;

import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.dao.SupplierDAO;
import com.niit.models.Supplier;

@SuppressWarnings("unused")
public class SupplierTest {

public static void main(String[] args) 
	{
		@SuppressWarnings("resource")
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.scan("com.niit");
		context.refresh();
		SupplierDAO supplierDAO = (SupplierDAO) context.getBean("supplierDAO");
		Supplier supplier = (Supplier) context.getBean("supplier");
		supplier.setId("TAB_004");
		supplier.setName("Tablet4");
		supplier.setAddress("Tablet product1");
		supplierDAO.saveOrUpdate(supplier);
		
		/*supplierDAO.delete("CAT_1");
		supplierDAO.get("CAT_1");
	
		List<Supplier>  list =    supplierDAO.list();
		
		for(Supplier cat : list)
		{
			System.out.println(cat.getId()  + ":" +  cat.getName()  + ":"+  cat.getAddress());
		}
			*/
			
		 
		
		
		
	}
}
