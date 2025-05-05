package com.edu.bms.entites;

import java.time.LocalDate;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="orders")
public class Orders {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer order_id;
	private Double totalAmount;
	private String status;
	private LocalDate orderDate;

	
	@ManyToOne
	@JsonIgnore
	@JoinColumn(name="cust_id",nullable=false)
	private Customer customer;
	
	@OneToMany(mappedBy = "order", cascade = CascadeType.ALL)
	@JsonIgnore
	private List<Product> product;

	public Orders() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Orders(Double totalAmount, String status, LocalDate orderDate, Customer customer, List<Product> product) {
		super();
		this.totalAmount = totalAmount;
		this.status = status;
		this.orderDate = orderDate;
		this.customer = customer;
		this.product = product;
	}


	public Integer getOrder_id() {
		return order_id;
	}

	public void setOrder_id(Integer order_id) {
		this.order_id = order_id;
	}

	public Double getTotalAmount() {
		return totalAmount;
	}

	public void setTotalAmount(Double totalAmount) {
		this.totalAmount = totalAmount;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public LocalDate getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(LocalDate orderDate) {
		this.orderDate = orderDate;
	}

	public List<Product> getProduct() {
		return product;
	}

	public void setProduct(List<Product> product) {
		this.product = product;
	}
	

	public Customer getCustomer() {
		return customer;
	}


	public void setCustomer(Customer customer) {
		this.customer = customer;
	}


	@Override
	public String toString() {
		return "Orders [order_id=" + order_id + ", totalAmount=" + totalAmount + ", status=" + status + ", orderDate="
				+ orderDate + ", customer=" + customer + ", product=" + product + "]";
	}


	
	
}
