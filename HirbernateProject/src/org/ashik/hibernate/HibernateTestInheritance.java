package org.ashik.hibernate;

import org.ashik.dto.BiCycle;
import org.ashik.dto.MountainBike;
import org.ashik.dto.RoadBike;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateTestInheritance {

	public static void main(String[] args) {
		BiCycle biCycle = new BiCycle();
		biCycle.setName("BiCycle");
		
		MountainBike mountainBike = new MountainBike();
		mountainBike.setName("Mountain Bike");
		mountainBike.setMaxMountainHeight(100);
		
		RoadBike roadBike = new RoadBike();
		roadBike.setName("Road Bike");
		roadBike.setMaxRoadDistance(150);
		
		SessionFactory sessionFactory = new Configuration().configure()
				.buildSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		session.save(biCycle);
		session.save(mountainBike);
		session.save(roadBike);
		session.getTransaction().commit();
		session.close();
		System.exit(0);
	}

}
