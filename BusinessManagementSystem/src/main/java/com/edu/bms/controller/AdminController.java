package com.edu.bms.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.edu.bms.entites.Customer;
import com.edu.bms.entites.Employee;
import com.edu.bms.service.CustomerService;
import com.edu.bms.service.EmployeeService;
import com.edu.bms.entites.Employee;
import com.edu.bms.error.GlobalException;

@RestController
public class AdminController {
	
	@Autowired
	private EmployeeService employeeService;
	
	@Autowired
	private CustomerService customerService;
	
	
	// EMPLOYEE
	
	// Add a new Employee
    @PostMapping("/admin/addEmployee")
    public Employee addEmployee(@RequestBody Employee employee) throws GlobalException {
        return employeeService.addemployee(employee);
    }
    
 // Get all employee
    @GetMapping("/admin/employee")
    public List<Employee> getAllEmployee() {
        return employeeService.getAllEmployee();
    }
    
 // Get employee by ID
    @GetMapping("/admin/employee/{id}")
    public Optional<Employee> getEmployeeById(@PathVariable Integer id) {
        return employeeService.getEmployeeById(id);
    }
    
    // Delete employee
    @DeleteMapping("/admin/employee/{id}")
    public void deleteEmployee(@PathVariable Integer id) {
        employeeService.deleteEmployee(id);
    }
    
 // Update a employee
    @PutMapping("/admin/updateEmployee/{id}")
    public Employee updateEmployee(@PathVariable Integer id, @RequestBody Employee updatedEmployee) throws GlobalException {
        Optional<Employee> existing = employeeService.getEmployeeById(id);
        if (existing.isPresent()) {
            Employee employee = existing.get();
            employee.setEmp_name(updatedEmployee.getEmp_name());
            employee.setPhone(updatedEmployee.getPhone());
            employee.setEmail(updatedEmployee.getEmail());
            employee.setPhone(updatedEmployee.getPhone());
            
            return employeeService.addemployee(employee);
        } else {
            throw new RuntimeException("Employee not found with id " + id);
        }
    }
    
    // CUSTOMER
    
    @PostMapping("/admin/addCustomers")
    public List<Customer> addCusotmers(@RequestBody List<Customer> customers){
    	return customerService.addCustomers(customers);
    }
    @GetMapping("/admin/cusomters")
    public List<Customer> getAllCustomers() {
        return customerService.getAllCustomers();
    }
    
    @DeleteMapping("/admin/deleteCustomer/{id}")
    public void deleteCusomter(@PathVariable Integer id) {
        customerService.deleteCustomer(id);
    }
}
