package com.Nau.SecondLevelCache;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

@Entity
@Table(name="N_Employee")
@Cache(usage=CacheConcurrencyStrategy.READ_ONLY)
public class Employee {
@Id
@GeneratedValue(strategy=GenerationType.AUTO)
private long id;
private String fname;
private String city;
public Employee(){
	
}
public Employee(long id, String fname, String city){
	this.id=id;
	this.fname=fname;
	this.city=city;
	System.out.println("User Object created");
}

public long getId() {
	return id;
}
public void setId(long id) {
	this.id = id;
}
public String getFname() {
	return fname;
}
public void setFname(String fname) {
	this.fname = fname;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}

@Override
public String toString() {
	return "Employee [id=" + id + ", fname=" + fname + ", city=" + city + "]";
}



}
