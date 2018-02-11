package org.ashik.hibernate;

import org.ashik.dto.Address;
import org.ashik.dto.PersonDetails;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * @author ashik.khan
 *
 */
public class HibernateTestAnother2 {
	public static void main(String[] args) {

		PersonDetails persion = new PersonDetails();
		persion.setName("PERSON NAME");

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

		persion.getListOfAddresses().add(address1);
		persion.getListOfAddresses().add(address2);

		SessionFactory sessionFactory = new Configuration().configure()
				.buildSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		try {
			Integer id = (Integer) session.save(persion);
			session.getTransaction().commit();
			System.out.println(session.get(PersonDetails.class, id));
		} catch (Exception ex) {
			session.getTransaction().rollback();
		} finally {
			session.close();
			System.exit(0);
		}
	}
}
