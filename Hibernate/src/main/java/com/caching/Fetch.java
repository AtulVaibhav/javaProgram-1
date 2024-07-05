package com.caching;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Fetch {

	public static void main(String[] args) {
		
		SessionFactory factory = new Configuration()
				.configure().buildSessionFactory();
		
		Session session = factory.openSession();
		Vehicle v = session.get(Vehicle.class, 1);
		System.out.println(v.getVehicleName());
		
	
		
		Session session2 = factory.openSession();
		Vehicle v1 = session2.get(Vehicle.class, 1);
		System.out.println(v1.getVehicleName());
		
		
	}

}
