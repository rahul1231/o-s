package net.rah.osbackend.dao;

import net.rah.osbackend.dto.Address;
import net.rah.osbackend.dto.Cart;
import net.rah.osbackend.dto.User;

public interface UserDAO {

	//add an user
	boolean addUser(User user);
	
	//add an address
	boolean addAddress(Address address);
	
	//add a cart
	boolean addCart(Cart cart);
	
	
}
