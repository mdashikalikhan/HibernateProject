package org.ashik.hibernate;

import org.ashik.dto.Employees;
import org.ashik.dto.Vehicle;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateTestAnother3 {

	public static void main(String[] args) {

		Employees employees = new Employees();
		employees.setName("MD. Ashik Ali Khan");

		Vehicle vehicle = new Vehicle();
		vehicle.setVehicleName("Toyota");
		
		employees.setVehicle(vehicle);
		
		SessionFactory sessionFactory = new Configuration().configure()
				.buildSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		session.save(employees);
		session.save(vehicle);
		session.getTransaction().commit();
		session.close();
		System.exit(0);
	}

}
