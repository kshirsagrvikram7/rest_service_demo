package com.vksagar.restservicedemo.dao;

import java.util.List;

import com.vksagar.restservicedemo.model.Customer;

public interface ICustomerDAO {
	
	void addCustomer(Customer customer);

	void updateCustomer(Customer customer);

	Customer getCustomerById(int id);
	
	void deleteCustomer(int id);
	
	List<Customer> getAllCustomers();

}
