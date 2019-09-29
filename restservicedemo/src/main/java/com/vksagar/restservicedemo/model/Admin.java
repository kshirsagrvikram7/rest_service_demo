package com.vksagar.restservicedemo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name = "tbs_admin")
@PrimaryKeyJoinColumn(name = "user_id")
public class Admin extends User {

	private static final long serialVersionUID = 1L;

	@Column(name = "name")
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		
		return super.toString() + "Admin [name=" + name + "]";
	}

}
