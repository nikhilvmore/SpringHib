package com.Nau.composition;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.Nau.SecondLevelCache.Employee;
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
		Customer cus = new Customer();
		
		cus.setName("NikhilCus");
		Address add = new Address();
		add.setCity("Pune");
		add.setStreet("slRoad");
		cus.setHomeAddress(add);
		
		Address addb = new Address();
		addb.setCity("Mumbai");
		addb.setStreet("lsroad");
		cus.setBillingAddress(addb);
		session.save(cus);
		
		tx.commit();
		session.flush();
		session.close();
		HibernateUtil.closeSessionFactory();
	}

}
