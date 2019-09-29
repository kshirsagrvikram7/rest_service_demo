package com.vksagar.restservicedemo.dao;

import java.util.List;

import com.vksagar.restservicedemo.model.Admin;

public interface IAdminDAO {

	void addAdmin(Admin admin);

	void updateAdmin(Admin admin);

	Admin getAdminById(int id);
	
	void deleteAdmin(int id);
	
	List<Admin> getAllAdmins();
}
