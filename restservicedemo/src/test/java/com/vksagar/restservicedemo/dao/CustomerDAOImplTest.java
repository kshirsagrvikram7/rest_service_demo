package com.vksagar.restservicedemo.dao;

import static org.junit.Assert.*;

import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.vksagar.restservicedemo.model.Customer;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CustomerDAOImplTest {

	@Autowired
	private CustomerDAOImpl customerDAOImpl;
	
	@Ignore
	@Test
	public void addCustomer() {
		Customer customer = new Customer();
		customer.setName("Alex Job");
		customer.setMobileNumber("9900000000");
		customer.setUsername("alex");
		customer.setPassword("Asdf@1234");
		customerDAOImpl.addCustomer(customer);
	}

//	@Ignore
	@Test
	public void updateCustomer() {
		Customer customer = new Customer();
		customer.setId(7);
		customer.setName("Alex Job");
		customer.setMobileNumber("9900000011");
		customer.setUsername("alex");
		customer.setPassword("Zxcv@1234");
		customerDAOImpl.updateCustomer(customer);
	}
}
