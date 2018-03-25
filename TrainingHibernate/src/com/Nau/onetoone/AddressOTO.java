package com.Nau.onetoone;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;

@Entity
public class AddressOTO {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long a_id;
	private String street;
	private String city;
	@OneToOne(fetch=FetchType.EAGER)
	private StudentOTO studentOTO;
	
	public AddressOTO() {
		// TODO Auto-generated constructor stub
	}
	public long getA_id() {
		return a_id;
	}
	public void setA_id(long a_id) {
		this.a_id = a_id;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public StudentOTO getStudentOTO() {
		return studentOTO;
	}
	public void setStudentOTO(StudentOTO studentOTO) {
		this.studentOTO = studentOTO;
	}
	

}
