package com.Nau.composition;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Customer {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long c_id;
	@Column
	private String name;
	
	@Embedded
	@AttributeOverrides({
	@AttributeOverride(name="street", column=@Column(name="Home_street")),
	@AttributeOverride(name="city", column=@Column(name="Home_city"))
	})
	private Address homeAddress ;
	
	@Embedded
	@AttributeOverrides({
	@AttributeOverride(name="street", column=@Column(name="Billing_street")),
	@AttributeOverride(name="city", column=@Column(name="Billing_city"))
	})
	private Address billingAddress ;
	
	public Customer() {
		// TODO Auto-generated constructor stub
	}
	public long getC_id() {
		return c_id;
	}
	public void setC_id(long c_id) {
		this.c_id = c_id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Address getHomeAddress() {
		return homeAddress;
	}
	public void setHomeAddress(Address homeAddress) {
		this.homeAddress = homeAddress;
	}
	
	public Address getBillingAddress() {
		return billingAddress;
	}
	public void setBillingAddress(Address billingAddress) {
		this.billingAddress = billingAddress;
	}
}
