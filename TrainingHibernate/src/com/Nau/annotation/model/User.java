package com.Nau.annotation.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.CreationTimestamp;

@Entity
@Table(name="User_Polarisa")
public class User {
@Id
@Column(name="p_uid")
//@GeneratedValue(strategy=GenerationType.AUTO)
private long uid;
@Column(name="p_username", columnDefinition="varchar2(10) default 'thisdefault'")
private String userName;
@Column(name="p_usercity")
private String userCity;
//@Temporal(TemporalType.TIMESTAMP)
@CreationTimestamp
@Column(updatable=false)
private Date createdDate;

@CreationTimestamp
@Column(insertable=false,updatable=false)
private Date modifiedDate;

public User(){
	
}
public User(long uid, String userName, String userCity){
	this.uid=uid;
	this.userName=userName;
	this.userCity=userCity;
	System.out.println("User Object created");
}
public long getUid() {
	return uid;
}
public void setUid(long uid) {
	this.uid = uid;
}
public String getUserName() {
	return userName;
}
public void setUserName(String userName) {
	this.userName = userName;
}
public String getUserCity() {
	return userCity;
}
public void setUserCity(String userCity) {
	this.userCity = userCity;
}
public Date getCreatedDate() {
	return createdDate;
}
public void setCreatedDate(Date createdDate) {
	this.createdDate = createdDate;
}
public Date getModifiedDate() {
	return modifiedDate;
}
public void setModifiedDate(Date modifiedDate) {
	this.modifiedDate = modifiedDate;
}

@Override
public String toString() {
	return "User [uid=" + uid + ", userName=" + userName + ", userCity="
			+ userCity + ", createdDate=" + createdDate + ", modifiedDate="
			+ modifiedDate + "]";
}



}

