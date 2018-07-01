package net.rah.os.service;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import net.rah.os.model.UserModel;
import net.rah.osbackend.dao.CartLineDAO;
import net.rah.osbackend.dto.Cart;
import net.rah.osbackend.dto.CartLine;

@Service("cartService")
public class CartService {

	@Autowired
	private CartLineDAO cartLineDAO;
	
	@Autowired
	private HttpSession session;
	
	//returns the cart of the user who has logged in
	private Cart getCart(){
		
		return ((UserModel)session.getAttribute("userModel")).getCart();
	}
	
	//returns the entire cart lines
	public List<CartLine> getCartLines(){
		return cartLineDAO.list(this.getCart().getId());
	}
	
}
