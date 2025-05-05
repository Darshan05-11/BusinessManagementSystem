package com.edu.bms.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.edu.bms.entites.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Integer> {

}
