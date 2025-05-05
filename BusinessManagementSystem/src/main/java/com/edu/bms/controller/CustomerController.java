package com.edu.bms.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.edu.bms.entites.Customer;
import com.edu.bms.entites.Employee;
import com.edu.bms.entites.Orders;
import com.edu.bms.repository.CustomerRepository;
import com.edu.bms.service.CustomerService;
import com.edu.bms.service.OrdersService;



@RestController
public class CustomerController {
	
	@Autowired
	private CustomerService customerService;
	
	@Autowired
	private OrdersService orderService;
	
	 @PostMapping("/customers/addCustomer")
	    public Customer addCustomer(@RequestBody Customer customer) {
	        return customerService.addCustomer(customer);
	    }
	 
	 @GetMapping("/customers/{id}")
	    public Customer getCustomerById(@PathVariable Integer id) {
	        return customerService.getCustomerById(id);
	    }
	 
	 @GetMapping("/getAllOrder")
	    public List<Orders> getAllOrder() {
	        return orderService.getAllOrder();
	    }
	 
	 @GetMapping("/getOrderById/{id}")
	    public Optional<Orders> getOrderById(@PathVariable Integer id) {
	        return orderService.getOrderId(id);
	 }

}
