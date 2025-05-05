package com.edu.bms.service;

import java.util.List;
import java.util.Optional;

import com.edu.bms.entites.Employee;

public interface EmployeeService {

	public Employee addemployee(Employee employee);

	public List<Employee> getAllEmployee();

	public Optional<Employee> getEmployeeById(Integer id);

	public void deleteEmployee(Integer id);

	

	

	

	

}
