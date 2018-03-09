package org.ashik.hibernate;

import org.ashik.dto.Officers;
import org.ashik.dto.Vehicle;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateTestAnother4 {

	public static void main(String[] args) {
		Officers officers = new Officers();
		officers.setName("Md. Ashik Ali Khan");
		
		Vehicle vehicle1 = new Vehicle();
		vehicle1.setVehicleName("ZIP");
		Vehicle vehicle2 = new Vehicle();
		vehicle2.setVehicleName("PAJERO");
		
		officers.getVehicle().add(vehicle1);
		officers.getVehicle().add(vehicle2);
		
		vehicle1.setOfficer(officers);
		vehicle2.setOfficer(officers);
		
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		
		session.beginTransaction();
		
		session.save(officers);
		session.save(vehicle1);
		session.save(vehicle2);
		
		session.getTransaction().commit();
		session.close();
		System.exit(0);
	}

}
