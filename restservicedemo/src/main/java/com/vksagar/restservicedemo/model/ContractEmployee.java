package com.vksagar.restservicedemo.model;

import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;

@Entity
@DiscriminatorColumn(name = "Contract")
public class ContractEmployee extends Employee {

	private static final long serialVersionUID = 1L;

	@Column(name = "pay_per_hour")
	private float payPerHour;
	@Column(name = "contract_period")
	private String contractPeriod;

	public float getPayPerHour() {
		return payPerHour;
	}

	public void setPayPerHour(float payPerHour) {
		this.payPerHour = payPerHour;
	}

	public String getContractPeriod() {
		return contractPeriod;
	}

	public void setContractPeriod(String contractPeriod) {
		this.contractPeriod = contractPeriod;
	}

}
