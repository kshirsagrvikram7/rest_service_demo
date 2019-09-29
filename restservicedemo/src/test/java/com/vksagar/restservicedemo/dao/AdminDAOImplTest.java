package com.vksagar.restservicedemo.dao;

import static org.junit.Assert.assertSame;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.vksagar.restservicedemo.model.Admin;

@RunWith(SpringRunner.class)
@SpringBootTest
public class AdminDAOImplTest {

	@Autowired
	AdminDAOImpl adminDAOImpl;

	@Ignore
	@Test
	public void addAdmin() {
		Admin admin = new Admin();
		admin.setName("NTR");
		admin.setUsername("ntr7");
		admin.setPassword("Asdf@1234");
		adminDAOImpl.addAdmin(admin);
	}
	
	@Ignore
	@Test
	public void updateAdmin() {
		Admin admin = new Admin();
		admin.setId(1);
		admin.setName("V Kshirsagar");
		admin.setUsername("vikram7");
		admin.setPassword("Asdf@1234");
		adminDAOImpl.updateAdmin(admin);
	}
	
	@Ignore
	@Test
	public void findAdminById() {
		Admin admin = adminDAOImpl.getAdminById(1);
		System.out.println("Admin :: "+admin.toString());
//		assertSame("V Kshirsagar", admin.getName());
	}
	
	@Ignore
	@Test
	public void deleteAdminById() {
		adminDAOImpl.deleteAdmin(3);
	}
	
	@Test
	public void adminList() {
		List<Admin> allAdmins = adminDAOImpl.getAllAdmins();
		System.out.println("Size :: "+allAdmins.size());
	}

}
