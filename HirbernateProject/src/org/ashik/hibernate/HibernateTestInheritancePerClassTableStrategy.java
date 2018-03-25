package org.ashik.hibernate;

import org.ashik.dto.BanglaFood;
import org.ashik.dto.ChineseFood;
import org.ashik.dto.Food;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateTestInheritancePerClassTableStrategy {

	public static void main(String[] args) {
		Food food = new Food();
		food.setName("DAL VAT");
		
		BanglaFood banglaFood = new BanglaFood();
		banglaFood.setName("SADA VAT");
		banglaFood.setBanglaItems("DAL VAT CURRY MASALA BEEF");
		
		
		ChineseFood chineseFood = new ChineseFood();
		chineseFood.setName("CHOWMEN");
		chineseFood.setChineseItems("NOODLES CHICKEN SALAD PRAWN");
		
		
		SessionFactory sessionFactory = new Configuration().configure()
				.buildSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		session.save(food);
		session.save(banglaFood);
		session.save(chineseFood);
		session.getTransaction().commit();
		session.close();
		System.exit(0);
	}

}
