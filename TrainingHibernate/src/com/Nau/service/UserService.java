package com.Nau.service;

import com.Nau.dao.UserDao;
import com.Nau.model.User;

public class UserService {
public boolean addUser(User... user){
	
	
	//business logic
	UserDao dao=new UserDao();
	dao.saveUser(user);
	return false;
}
public User getUser(Long id){
	UserDao dao=new UserDao();
	return dao.getUser(id);
}
}
