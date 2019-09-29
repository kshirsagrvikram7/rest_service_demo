package com.vksagar.restservicedemo.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.vksagar.restservicedemo.model.Admin;

@Transactional
@Repository
public class AdminDAOImpl implements IAdminDAO {

	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public void addAdmin(Admin admin) {
		Session session = sessionFactory.getCurrentSession();
		session.save(admin);
	}

	@Override
	public void updateAdmin(Admin admin) {
		Session session = sessionFactory.getCurrentSession();
		
		Admin newAdmin = session.get(Admin.class, admin.getId());
		newAdmin.setId(admin.getId());
		newAdmin.setName(admin.getName());
		newAdmin.setUsername(admin.getUsername());
		newAdmin.setPassword(admin.getPassword());
		
		session.update(newAdmin);
		
	}

	@Override
	public Admin getAdminById(int id) {
		Session session = sessionFactory.getCurrentSession();
		return session.get(Admin.class, id);
	}

	@Override
	public void deleteAdmin(int id) {
		Session session = sessionFactory.getCurrentSession();
		session.delete(getAdminById(id));
		
	}

	@Override
	public List<Admin> getAllAdmins() {
		Session session = sessionFactory.getCurrentSession();
		
		return session.createCriteria(Admin.class).list();
	}


}
