package com.Nau.onetoone;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.Nau.SecondLevelCache.Employee;
import com.Nau.util.HibernateUtil;

public class DemoOTO {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

SessionFactory sessionFactory=null;
		
		SessionFactory factory= HibernateUtil.getSessionFactory();
		Session session = factory.openSession();
		Transaction tx= session.beginTransaction();
		StudentOTO stu = new StudentOTO();
		stu.setS_name("Nikhil3");
		AddressOTO adr= new AddressOTO();
		adr.setCity("Mumbai3");
		adr.setStreet("MG Road3");
		adr.setStudentOTO(stu);
		
		
		AddressOTO adr2= new AddressOTO();
		adr2.setCity("Pune3");
		adr2.setStreet("LG Road3");
		adr2.setStudentOTO(stu);
		List<AddressOTO> addset = new ArrayList<AddressOTO>();
		addset.add(adr);
		addset.add(adr2);
		stu.setAddress(addset);
		
		session.save(stu);
		tx.commit();
		session.flush();
		session.close();
		HibernateUtil.closeSessionFactory();
	}

}
