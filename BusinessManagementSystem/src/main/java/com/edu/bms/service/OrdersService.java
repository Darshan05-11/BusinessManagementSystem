package com.edu.bms.service;

import java.util.List;
import java.util.Optional;

import com.edu.bms.entites.Orders;

public interface OrdersService {

	public List<Orders> getAllOrder();

	public Optional<Orders> getOrderId(Integer id);

	public Orders addorder(Orders order);

	public void deleteorder(Integer id);

}
