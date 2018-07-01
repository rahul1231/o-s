package net.rah.osbackend.dao;

import java.util.List;

import net.rah.osbackend.dto.Cart;
import net.rah.osbackend.dto.CartLine;

public interface CartLineDAO {

	public CartLine get(int id);
	public boolean add(CartLine cartLine);
	public boolean update(CartLine cartLine);
	public boolean delete(CartLine cartLine);
	public List<CartLine> list(int cartId);
	
	//other business methods related to te cartlines
	public List<CartLine> listAvailable(int cartId);
	public CartLine getByCartAndProduct(int cartId,int productId);
	
	//update a cart
	boolean updateCart(Cart cart);
	
}
