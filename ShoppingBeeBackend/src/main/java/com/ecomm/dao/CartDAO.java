package com.ecomm.dao;

import java.util.List;

import com.ecomm.entity.Cart;


public interface CartDAO {
	public boolean addCart(Cart cart);
	public boolean deleteCart(Cart cart);
	public boolean updateCart(Cart cart);
	public List<Cart> getCartDetails();
	public Cart getCart(int cartId);
}
