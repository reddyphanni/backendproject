package com.niit;

import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.dao.UserDetailsDAO;
import com.niit.models.UserDetails;

public class UserDetailsTest {

public static void main(String[] args) 
	{
		@SuppressWarnings("resource")
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.scan("com.niit");
		context.refresh();
		UserDetailsDAO userDetailsDAO = (UserDetailsDAO) context.getBean("userDetailsDAO");
		UserDetails user = (UserDetails) context.getBean("userDetails");
		user.setId("TAB_004");
		user.setName("Tablet4");
		user.setPassword("12345");
		user.setMobile("7207519669");
		user.setMail("dheeraj@gmail.com");
		user.setAddress("Address 1");
		userDetailsDAO.saveOrUpdate(user);
		
	/*	userDAO.delete("TAB_004");
		userDAO.get("TAB_004");*/
	
		List<UserDetails>  list =    userDetailsDAO.list();
		
		for(UserDetails cat : list)
		{
			System.out.println(cat.getId()  + ":" +  cat.getName()  + ":"+  cat.getMobile() + ":"+  cat.getMail() + ":"+  cat.getAddress());
		}
			
			
		
		
	}
}
