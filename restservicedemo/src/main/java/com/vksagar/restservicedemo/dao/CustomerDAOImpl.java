package com.vksagar.restservicedemo.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.vksagar.restservicedemo.model.Customer;

@Transactional
@Repository
public class CustomerDAOImpl implements ICustomerDAO {

	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public void addCustomer(Customer customer) {
		Session session = sessionFactory.getCurrentSession();
		
		session.save(customer);
	}

	@Override
	public void updateCustomer(Customer customer) {
		Session session = sessionFactory.getCurrentSession();
		Customer newCustomer = session.get(Customer.class, customer.getId());
		newCustomer.setName(customer.getName());
		newCustomer.setMobileNumber(customer.getMobileNumber());
		newCustomer.setUsername(customer.getUsername());
		newCustomer.setPassword(customer.getPassword());
		session.update(customer);
	}

	@Override
	public Customer getCustomerById(int id) {
		Session session = sessionFactory.getCurrentSession();
		return session.get(Customer.class, id);
	}

	@Override
	public void deleteCustomer(int id) {
		Session session = sessionFactory.getCurrentSession();
		session.delete(getCustomerById(id));
	}

	@Override
	public List<Customer> getAllCustomers() {
		Session session = sessionFactory.getCurrentSession();
		return session.createCriteria(Customer.class).list();
	}

}
