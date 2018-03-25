package org.ashik.hibernate;

import org.ashik.dto.Animal;
import org.ashik.dto.Bird;
import org.ashik.dto.Dog;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateTestInheritanceJoined {

	public static void main(String[] args) {
		
		Bird bird = new Bird();
		bird.setName("SEA GULL");
		bird.setMoveRatio(99.9);
		
		Dog dog = new Dog();
		dog.setName("DOGGY");
		dog.setDigRatio(80);
		
		
		SessionFactory sessionFactory = new Configuration().configure()
				.buildSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		session.save(bird);
		session.save(dog);
		session.getTransaction().commit();
		session.close();
		System.exit(0);
	}

}
