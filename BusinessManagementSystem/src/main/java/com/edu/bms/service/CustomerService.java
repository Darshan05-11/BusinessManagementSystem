package com.edu.bms.service;

import java.util.List;

import com.edu.bms.entites.Customer;

public interface CustomerService {

	public List<Customer> addCustomers(List<Customer> customers);

	public List<Customer> getAllCustomers();

	public Customer addCustomer(Customer customer);

	public Customer getCustomerById(Integer id);

	public void deleteCustomer(Integer id);

	

	
}
