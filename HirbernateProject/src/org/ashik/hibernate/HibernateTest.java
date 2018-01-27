package org.ashik.hibernate;

import java.util.Date;

import org.ashik.dto.UserDeatils;
import org.ashik.dto.UserInfo;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateTest {

	public static void main(String[] args) {
		UserDeatils user = new UserDeatils();
		user.setUserId(3);
		user.setUserName("Third User");
		
		UserInfo userInfo = new UserInfo();
		userInfo.setUserId(3);
		userInfo.setUserName("Third User");
		userInfo.setJoinedDate(new Date());
		userInfo.setLastEntryDate(new Date());
		userInfo.setAdress("Address");
		userInfo.setDescription("User Description");
		
		SessionFactory sessionFactory = new Configuration().configure()
				.buildSessionFactory();
		Session session = sessionFactory.openSession();
		/*session.beginTransaction();
		session.save(userInfo);
		session.getTransaction().commit();*/
		session.close();
		
		userInfo = null;
		
		session = sessionFactory.openSession();
		session.beginTransaction();
		userInfo = session.get(UserInfo.class, 3);
		session.close();
		
		System.out.println("Id: " + userInfo.getUserId());
		System.out.println("Address: " + userInfo.getAdress());
		System.out.println("Joing Date: " + userInfo.getJoinedDate());
		System.out.println("Last Entry Date with Time: " + userInfo.getLastEntryDate());
		System.out.println("Description: " + userInfo.getDescription());
		
		System.exit(0);
	}

}
