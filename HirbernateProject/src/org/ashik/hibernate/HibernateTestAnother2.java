package org.ashik.hibernate;

import org.ashik.dto.Address;
import org.ashik.dto.PersonDetails;
import org.ashik.dto.Phones;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * @author ashik.khan
 *
 */
public class HibernateTestAnother2 {
	public static void main(String[] args) {
		PersonDetails person = new PersonDetails();
		person.setName("PERSON NAME");

		Address address1 = new Address();
		address1.setCity("PERSON CITY");
		address1.setPinCode("PINCODE");
		address1.setState("PERSON STATE");
		address1.setStreet("PERSON STREET");

		Address address2 = new Address();
		address2.setCity("PERSON PERMANENT CITY");
		address2.setPinCode("PINCODE");
		address2.setState("PERSON STATE");
		address2.setStreet("PERSON STREET");
		
		Phones phones1 = new Phones();
		phones1.setLandNo("999-XXX");
		phones1.setMobileNo("01X-XXX");
		
		Phones phones2 = new Phones();
		phones2.setLandNo("888-XXX");
		phones2.setMobileNo("017-XXX");

		person.getListOfAddresses().add(address1);
		person.getListOfAddresses().add(address2);
		
		person.getListOfPhones().add(phones1);
		person.getListOfPhones().add(phones2);

		SessionFactory sessionFactory = new Configuration().configure()
				.buildSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		Integer id=0;
		try {
			id = (Integer) session.save(person);
			session.getTransaction().commit();
			System.out.println(session.get(PersonDetails.class, id));
		} catch (Exception ex) {
			session.getTransaction().rollback();
		} finally {
			session.close();
		}
		
		person = null;
		session = sessionFactory.openSession();
		
		person = session.get(PersonDetails.class, id);
		session.close();
		System.out.println(person.getId() + " ~ " + person.getName());
		
		System.out.println(person.getListOfPhones().size());
		
		System.out.println(person.getListOfAddresses().size());
		
		
		
		System.exit(0);
	}
}
