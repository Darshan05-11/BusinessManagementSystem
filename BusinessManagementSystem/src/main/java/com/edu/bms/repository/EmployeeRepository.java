package com.edu.bms.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.edu.bms.entites.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

}
