package com.vksagar.restservicedemo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name = "tbs_customer")
@PrimaryKeyJoinColumn(name = "user_id")
public class Customer extends User {

	private static final long serialVersionUID = 1L;

	@Column(name = "name")
	private String name;
	@Column(name = "mobile_number")
	private String mobileNumber;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	@Override
	public String toString() {
		return super.toString() + "Customer [name=" + name + ", mobileNumber=" + mobileNumber + "]";
	}

}
