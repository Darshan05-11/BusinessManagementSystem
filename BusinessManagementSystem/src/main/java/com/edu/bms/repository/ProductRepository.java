package com.edu.bms.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.edu.bms.entites.Product;

public interface ProductRepository extends JpaRepository<Product, Integer> {

}
