package com.Nau.coll;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.Nau.composition.Address;
import com.Nau.composition.Customer;
import com.Nau.model.User;
import com.Nau.util.HibernateUtil;

public class Demo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
	
		// TODO Auto-generated method stub
		SessionFactory sessionFactory=null;
		
		/*SessionFactory factory= HibernateUtil.getSessionFactory();
		Session session = factory.openSession();
		Transaction tx= session.beginTransaction();
		TeamLeader tmld = new TeamLeader();
		tmld.setLeader_id(1L);
		tmld.setLeader_name("Nikhil");
		List<String> tmMembers = new ArrayList<String>();
		tmMembers.add("Nikhil1");
		tmMembers.add("Nikhil2");
		tmMembers.add("Nikhil3");
		tmld.setTeamMembers(tmMembers);
		
		//session.save(tmld);
		
		tx.commit();
		session.flush();
		session.close();
		HibernateUtil.closeSessionFactory();*/
		
		SessionFactory factory= HibernateUtil.getSessionFactory();
		Session session = factory.openSession();
		Transaction tx= session.beginTransaction();
		TeamLeader tmld = new TeamLeader();
		tmld.setLeader_id(2L);
		tmld.setLeader_name("Nikhil2");
		Map<String, String> tmMembers = new HashMap<String, String>();
		tmMembers.put("1","Nikhil1");
		tmMembers.put("2","Nikhil2");
		tmMembers.put("3","Nikhil3");
		tmMembers.put("4","Nikhil2");
		tmld.setTeamMembers(tmMembers);
		
		session.save(tmld);
		
		tx.commit();
		session.flush();
		session.close();
		HibernateUtil.closeSessionFactory();
		
		/*String hql="from TeamLeader s where s.leader_id='1L'";
		
		SessionFactory sessionFactory1=HibernateUtil.getSessionFactory();
		Session session1 =sessionFactory1.openSession();
		Transaction tr1=session1.beginTransaction();
		
		Query query=session1.createQuery(hql);
		List<TeamLeader> list=query.list();
		System.out.println("List : "+list);
		TeamLeader user=(TeamLeader)list.get(0);
		System.out.println("List : "+user.getTeamMembers());
		//Object obj=session1.get(TeamLeader.class, 1L);
		//TeamLeader user=(TeamLeader)obj;
		//System.out.println(user.getTeamMembers());
		
		session1.flush();
		session1.close();*/
		
	}

}
