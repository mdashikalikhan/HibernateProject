package org.ashik.hibernate;

import org.ashik.dto.ITTeacher;
import org.ashik.dto.PhysicsTeacher;
import org.ashik.dto.Teacher;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateTestSingleTableInheritance {

	public static void main(String[] args) {

		Teacher teacher = new Teacher();
		teacher.setName("Head Instructor");

		PhysicsTeacher physicsTeacher = new PhysicsTeacher();
		physicsTeacher.setName("Teacher Physics");
		physicsTeacher.setLevelPhysics(80);

		ITTeacher itTeacher = new ITTeacher();
		itTeacher.setName("Teacher IT");
		itTeacher.setLevelIT(79);

		SessionFactory sessionFactory = new Configuration().configure()
				.buildSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		session.save(teacher);
		session.save(physicsTeacher);
		session.save(itTeacher);
		session.getTransaction().commit();
		session.close();
		System.exit(0);
	}
}
