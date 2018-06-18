package net.rah.osbackend.dao;

import net.rah.osbackend.dto.Address;
import net.rah.osbackend.dto.Cart;
import net.rah.osbackend.dto.User;

public interface UserDAO {

	//add an user
	boolean addUser(User user);
	User getByEmail(String email);
	
	//add an address
	boolean addAddress(Address address);
	
	//update a cart
	boolean updateCart(Cart cart);
	
	
}
