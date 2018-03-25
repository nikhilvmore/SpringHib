package com.Nau.dao;



import java.io.Serializable;
import java.util.Iterator;

import org.hibernate.Hibernate;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.Nau.model.User;
import com.Nau.util.HibernateUtil;

public class UserDao {
	
	public User getUser(long id){
		SessionFactory sessionFactory=HibernateUtil.getSessionFactory();
		Session session =sessionFactory.openSession();
		Transaction tr=session.beginTransaction();
		
		Object obj=session.get(User.class, id);
		System.out.println("obj :"+obj);
		User user=(User)obj;
		System.out.println("user :"+user);
		
		/*Object obj=session.load(User.class, id);
		Hibernate.initialize(obj);
		User user=(User)obj;
		System.out.println("user :"+user.getUid());*/
		
		//tr.commit();
		session.close();
		
		user.setUserCity("newCity");
		Session session2 =sessionFactory.openSession();
		//Transaction tr2=session2.beginTransaction();
		User user2=(User)session2.get(User.class, id);
		session2.merge(user);
		
		session2.flush();
//		/tr2.commit();
		session2.close();
		HibernateUtil.closeSessionFactory();
		return user;
	}
	
public boolean saveUser(User... user){
	SessionFactory sessionFactory=HibernateUtil.getSessionFactory();
	//logic to insert in database
	Session session =sessionFactory.openSession();
	Transaction tr=session.beginTransaction();
	for (User user2 : user) {
		System.out.println(user2);
		Serializable s1=session.save(user2);
		System.out.println(s1);
	}
	tr.commit();
	//session.flush();
	session.close();
	HibernateUtil.closeSessionFactory();
	
	return false;
}

public static void main(String[] args){
	try{
	new UserDao();
	}catch(Exception ex){
		ex.printStackTrace();
	}
}
}
