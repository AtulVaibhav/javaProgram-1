package com.caching;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Main {

	public static void main(String[] args) {
		Vehicle v1 = new Vehicle();
		v1.setVehicleName("Santro");
		
		SessionFactory factory = new Configuration()
				.configure().buildSessionFactory();
		
		Session session = factory.openSession();
		session.beginTransaction();
		session.save(v1);
		session.getTransaction().commit();
		session.close();
		System.out.println("Vehicle saved successfully");

	}

}
