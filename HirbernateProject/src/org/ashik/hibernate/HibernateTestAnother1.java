package org.ashik.hibernate;

import org.ashik.dto.UserIncremental;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateTestAnother1 {

	public static void main(String[] args) {
		
		UserIncremental userIncremental = new UserIncremental();
		userIncremental.setName("Name for user");
		
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		session.save(userIncremental);
		session.getTransaction().commit();
		session.close();
		System.exit(0);
	}

}
