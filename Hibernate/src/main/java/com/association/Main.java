package com.association;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Main {

	public static void main(String[] args) {
		Address addr = new Address("Bangalore","Karnataka");
		Employee emp = new Employee("Harsh",addr);
		
		SessionFactory factory= new Configuration()
				                .configure()
				                .buildSessionFactory();
		
		
		Session session = factory.openSession();
		session.beginTransaction();
		session.save(emp);
		
		session.getTransaction().commit();
		session.close();
		System.out.println("Employee saved successfully");
		
		
		
		

	}

}
