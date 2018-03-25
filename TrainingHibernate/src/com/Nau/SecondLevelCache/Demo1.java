package com.Nau.SecondLevelCache;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.Nau.model.User;
import com.Nau.util.HibernateUtil;

public class Demo1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SessionFactory sessionFactory=null;
		
		SessionFactory factory= HibernateUtil.getSessionFactory();
		Session session = factory.openSession();
		Transaction tx= session.beginTransaction();
		
		Object obj=session.get(Employee.class, 4L);
		Employee emp=(Employee)obj;
		System.out.println("Fname :"+emp.getFname());
		System.out.println("city :"+emp.getCity());
		
		session.flush();
		session.close();
		
		System.out.println("====");
		
		try{
			Thread.sleep(6000);
		}catch(Exception ex){
			
		}
		System.out.println("6 seconds completed...");
		
		
		Session session2 = factory.openSession();
		Transaction tx2= session2.beginTransaction();
		
		Object obj2=session2.get(Employee.class, 4L);
		Employee emp2=(Employee)obj2;
		System.out.println("Fname :"+emp2.getFname());
		System.out.println("city :"+emp2.getCity());
		
		HibernateUtil.closeSessionFactory();
	}
}
