package com.Nau.annotation.model;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.Nau.util.HibernateUtil;

public class demo {
	
	public static void main(String[] args){
		SessionFactory factory= HibernateUtil.getSessionFactory();
		Session session = factory.openSession();
		Transaction tx= session.beginTransaction();
		User us = new User(15,null,"MumbaiAnnotation");
		session.save(us);
		
		/*User us1 = (User)session.get(User.class, 11L);
		System.out.println(us1);
		User us2 = (User)session.get(User.class, 11L);
		System.out.println(us2);
		*/
		tx.commit();
	}

}
