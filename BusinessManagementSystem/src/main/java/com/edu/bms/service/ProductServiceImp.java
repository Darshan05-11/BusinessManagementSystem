package com.edu.bms.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.edu.bms.entites.Employee;
import com.edu.bms.entites.Product;
import com.edu.bms.repository.ProductRepository;

public class ProductServiceImp implements ProductService {
	
	@Autowired
	private ProductRepository productRepository;

	@Override
	public List<Product> getAllProduct() {
		// TODO Auto-generated method stub
		return productRepository.findAll();
	}

	@Override
	public Product addproduct(Product product) {
		// TODO Auto-generated method stub
		return productRepository.save(product);
	}

	@Override
	public void deleteproduct(Integer id) {
		// TODO Auto-generated method stub
		productRepository.deleteById(id);
	}

	
}
