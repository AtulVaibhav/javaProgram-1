package com.association;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Main2 {

	public static void main(String[] args) {
		SessionFactory factory = new Configuration()
				                .configure()
				                .buildSessionFactory();

		Session session = factory.openSession();
		
		Employee emp = session.get(Employee.class, 1);
		System.out.println(emp.getEmpName()+" "
		                  +emp.getAddress().getCity()+" "
		                  +emp.getAddress().getState());
		
		session.close();

	}

}
