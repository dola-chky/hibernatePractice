package com.dola.hibernateprac;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateTest {
	public static void main(String[] args) {
		UserDetails user = new UserDetails();
		user.setUserId(7);
		user.setUserName("7th user");
		System.out.println("before session");
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		System.out.println("after session");
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		session.save(user);
		session.getTransaction().commit();
		sessionFactory.close();
	}
}
