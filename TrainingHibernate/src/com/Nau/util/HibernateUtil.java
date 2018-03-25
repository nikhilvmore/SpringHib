package com.Nau.util;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {
	static SessionFactory sessionFactory;
	static
	{
		Configuration configuration = new Configuration();
		configuration.configure();
		System.out.println("configuration loaded");
		StandardServiceRegistryBuilder builder = new StandardServiceRegistryBuilder();
		builder.applySettings(configuration.getProperties());
		StandardServiceRegistry serviceregistery=builder.build();
		sessionFactory=configuration.buildSessionFactory(serviceregistery);
		System.out.println("factory working");
		
	}
	
	public static SessionFactory getSessionFactory(){
		
		return sessionFactory;
	}
	
	public static void closeSessionFactory(){
		sessionFactory.close();
	}
}
