package com.onetomany;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class FetchingProduct {

	public static void main(String[] args) {
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		session.beginTransaction();
		
		Category savedCategory = session.get(Category.class, 1);
		System.out.println(savedCategory.getCategoryName());
		
		for(Product p:savedCategory.getProduct()) {
			System.out.println(p.getProductName());
		}
		
		

	}

}
