package com.Nau.view;

import java.security.Provider.Service;

import com.Nau.model.User;
import com.Nau.service.UserService;

public class UserPresentation {

	public static void main(String[] args){
	/*User user =new User(7,"Nikhil3","Mumbai");
	User user2 =new User(8,"Nikhil4","Mumbai");
	UserService service=new UserService();
	service.addUser(user,user2);*/
	UserService service=new UserService();
	User userx = service.getUser(3L);
	}
}
