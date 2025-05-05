package com.edu.bms.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.edu.bms.entites.Orders;
import com.edu.bms.entites.Product;
import com.edu.bms.error.GlobalException;
import com.edu.bms.service.ProductService;

@RestController
public class ProductController {
	
	@Autowired
	private ProductService productService;
	
	 @PostMapping("/addProduct")
	    public Product addProduct(@RequestBody Product product) throws GlobalException {
	        return productService.addproduct(product);
	    }
	 
	 @DeleteMapping("/deleteProduct/{id}")
	    public void deleteOrder(@PathVariable Integer id) {
	        productService.deleteproduct(id);
	    }

}
