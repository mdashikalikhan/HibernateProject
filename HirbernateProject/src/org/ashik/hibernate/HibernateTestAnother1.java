package org.ashik.hibernate;

import java.util.Date;

import org.ashik.dto.Address;
import org.ashik.dto.Customers;
import org.ashik.dto.UserIncremental;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateTestAnother1 {

	public static void main(String[] args) {
		
		UserIncremental userIncremental = new UserIncremental();
		userIncremental.setName("User Name");
		
		Customers customers = new Customers();
		customers.setName("CUSTOMER NAME");
		customers.setDateOfBirth(new Date(99, 11, 1));
		customers.setPhone("01XXXXXXXXX");
		Address address = new Address();
		address.setCity("CUSTOMER CITY");
		address.setState("CUSTOMER STATE");
		address.setStreet("CUSTOMER STREET");
		customers.setAddress(address);
		
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		session.save(userIncremental);
		session.save(customers);
		session.getTransaction().commit();
		session.close();
		
		userIncremental = null;
		customers = null;
				
		session = sessionFactory.openSession();
		session.beginTransaction();
		try{
			customers = session.get(Customers.class, 29);
			System.out.println(customers);
		}catch(Exception e) {
			
		}
		try {			
			userIncremental = session.get(UserIncremental.class, 5);
			/*System.out.println("User Id: " + userIncremental.getId());
			System.out.println("User Name: " + userIncremental.getName());*/
			System.out.println(userIncremental);
		} catch (Exception ex) {
			System.out.println("Item not found");
		} finally {
			session.getTransaction().commit();
			session.close();
		}
		
		
		
		System.exit(0);
	}

}
