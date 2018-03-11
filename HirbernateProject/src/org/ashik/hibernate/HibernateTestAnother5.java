package org.ashik.hibernate;

import org.ashik.dto.StudentsDetails;
import org.ashik.dto.SubjectDetails;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateTestAnother5 {

	public static void main(String[] args) {
		StudentsDetails student1 = new StudentsDetails();
		student1.setName("STUDENT NAME");
		
		StudentsDetails student2 = new StudentsDetails();
		student2.setName("STUDENT NAME 2");
		
		SubjectDetails subject1 = new SubjectDetails();
		subject1.setName("PHYSICS");
		
		SubjectDetails subject2 = new SubjectDetails();
		subject2.setName("CHEMISTRY");
		
		student1.getSubjects().add(subject1);
		student1.getSubjects().add(subject2);
		
		student2.getSubjects().add(subject2);
		
		subject1.getStudents().add(student1);
		
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		session.save(student2);
		session.save(student1);
		session.save(subject2);
		session.save(subject1);
		session.getTransaction().commit();
		session.close();
		System.exit(0);
	}

}
