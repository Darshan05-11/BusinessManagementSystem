package com.edu.bms.service;

import java.util.List;

import com.edu.bms.entites.Employee;
import com.edu.bms.entites.Product;

public interface ProductService {

	public List<Product> getAllProduct();

	public Product addproduct(Product product);

	public void deleteproduct(Integer id);

	

}
