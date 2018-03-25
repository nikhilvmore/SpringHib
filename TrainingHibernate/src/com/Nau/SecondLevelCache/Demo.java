package com.Nau.SecondLevelCache;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.Nau.annotation.model.User;
import com.Nau.util.HibernateUtil;

public class Demo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SessionFactory sessionFactory=null;
		
		SessionFactory factory= HibernateUtil.getSessionFactory();
		Session session = factory.openSession();
		Transaction tx= session.beginTransaction();
		Employee ey = new Employee(22,"NikhilSec3","MumbaiAnnotation3");
		session.save(ey);
		tx.commit();
		session.flush();
		session.close();
		HibernateUtil.closeSessionFactory();
	}

}
