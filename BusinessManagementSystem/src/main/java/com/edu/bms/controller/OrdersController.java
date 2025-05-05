package com.edu.bms.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.edu.bms.entites.Employee;
import com.edu.bms.entites.Orders;
import com.edu.bms.entites.Product;
import com.edu.bms.error.GlobalException;
import com.edu.bms.service.OrdersService;
import com.edu.bms.service.ProductService;

@RestController
public class OrdersController {
	
	@Autowired
	private OrdersService orderService;
	
	private ProductService productService;
	
	 @PostMapping("/addOrder")
	    public Orders addOrder(@RequestBody Orders order) throws GlobalException {
	        return orderService.addorder(order);
	    }
	 
	 @DeleteMapping("/deleteOrder/{id}")
	    public void deleteOrder(@PathVariable Integer id) {
	        orderService.deleteorder(id);
	    }
	 
	  @GetMapping("/getAllProduct")
	    public List<Product> getAllProduct() {
	        return productService.getAllProduct();
	    }

}
