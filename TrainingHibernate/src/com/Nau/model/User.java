package com.Nau.model;

import java.util.Date;

import javax.persistence.Temporal;
import javax.persistence.TemporalType;

public class User {
private long uid;
private String userName;

private String userCity;
@Temporal(TemporalType.TIMESTAMP)
private Date createdDate;
@Temporal(TemporalType.TIMESTAMP)
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
