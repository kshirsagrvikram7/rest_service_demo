package com.vksagar.restservicedemo.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.vksagar.restservicedemo.model.ContractEmployee;
import com.vksagar.restservicedemo.model.RegularEmployee;

@RunWith(SpringRunner.class)
@SpringBootTest
public class EmployeeDAOImplTest {
	
	@Autowired
	private SessionFactory sessionFactory;

	@Autowired
	EmployeeDAOImpl employeeDAOImpl; 
	
	@Test
	public void addRegularEmployee() {
		Session session = sessionFactory.openSession();
		RegularEmployee regularEmployee = new RegularEmployee();
		regularEmployee.setName("Arya Stark");
		regularEmployee.setBonus(900);
		regularEmployee.setSalary(10000.00f);
		
		session.save(regularEmployee);	
	}
	
	@Test
	public void addContractEmployee() {
		Session session = sessionFactory.openSession();
		ContractEmployee contractEmployee = new ContractEmployee();
		contractEmployee.setName("Theon Grejoy");
		contractEmployee.setPayPerHour(100);
		contractEmployee.setContractPeriod("1 year");
		session.save(contractEmployee);	
	}

}
