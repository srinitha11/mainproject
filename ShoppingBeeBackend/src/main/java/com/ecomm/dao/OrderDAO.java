package com.ecomm.dao;

import java.util.List;

import com.ecomm.entity.OrderDetails;

public interface OrderDAO {
	public boolean addOrder(OrderDetails order);
	public boolean deleteOrder(OrderDetails order);
	public boolean updateOrder(OrderDetails order);
	public List<OrderDetails> getOrderDetails();
	public OrderDetails getOrder(int orderId);

}
