package net.rah.osbackend.test;

import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import net.rah.osbackend.dao.UserDAO;
import net.rah.osbackend.dto.Address;
import net.rah.osbackend.dto.Cart;
import net.rah.osbackend.dto.User;

public class UserTestCase {

private static AnnotationConfigApplicationContext context;
	
	private static UserDAO userDAO;
	
	private User user=null;
	
	private Cart cart=null;
	
	private Address address=null;
	
	@BeforeClass
	public static void init() {
		
		context=new AnnotationConfigApplicationContext();
		context.scan("net.rah.osbackend.*");
		context.refresh();
		
		userDAO=(UserDAO)context.getBean("userDAO");
		
	}
	
	/*
	@Test
	public void testAdd() {
		
		user=new User();
		user.setFirstName("Hrithik");
		user.setLastName("Roshan");
		user.setEmail("hr@gmail.com");
		user.setContactNumber("1234512345");
		user.setRole("USER");
		user.setPassword("123456");
		
		
		if(user.getRole().equals("USER")){
			
			//create a cart for this user
			cart=new Cart();
			cart.setUser(user);
			
			//attach cart with the user
			user.setCart(cart);
		}
		
		//add the user
		assertEquals("Failure!",true,userDAO.addUser(user));
		
		
	}
	*/
	
	
	@Test
	public void testUpdateCart() {
		
		//fetch the user by its email
		user=userDAO.getByEmail("hr@gmail.com");
		
		//get the cart of the user
		cart=user.getCart();
		
		cart.setGrandTotal(5555);
		
		cart.setCartLines(2);
		
		assertEquals("Failure",true,userDAO.updateCart(cart));
		
	}
	
	
}
