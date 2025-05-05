package com.edu.bms.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.edu.bms.entites.Orders;
import com.edu.bms.repository.OrdersRepository;

@Service
public class OrdersServiceImp implements OrdersService {
	
	@Autowired
	private OrdersRepository ordersRepository;

	@Override
	public List<Orders> getAllOrder() {
		// TODO Auto-generated method stub
		return ordersRepository.findAll();
	}

	@Override
	public Optional<Orders> getOrderId(Integer id) {
		// TODO Auto-generated method stub
		return ordersRepository.findById(id);
	}

	@Override
	public Orders addorder(Orders order) {
		// TODO Auto-generated method stub
		return ordersRepository.save(order);
	}

	@Override
	public void deleteorder(Integer id) {
		// TODO Auto-generated method stub
		ordersRepository.deleteById(id);
	}
}
