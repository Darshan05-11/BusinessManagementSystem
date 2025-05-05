package com.edu.bms.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.edu.bms.entites.Orders;

public interface OrdersRepository extends JpaRepository<Orders, Integer> {

}
