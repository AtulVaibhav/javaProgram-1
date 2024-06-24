package in.advjava.Hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Test1 {

	public static void main(String[] args) {
		
		Product p1 = new Product();
		p1.setProductId(101);
		p1.setProductName("Samsung-S23");
		p1.setCategory("Mobile");
		p1.setProductPrice(120000);
		
		Product p2 = new Product();
		p2.setProductId(102);
		p2.setProductName("Hp-laptop");
		p2.setCategory("Laptops");
		p2.setProductPrice(92000);
		
		//get configuration object
		Configuration config = new Configuration()
				              .configure("hibernate.cfg.xml");
		
		//getting factory object
		SessionFactory sessionFactory = config.buildSessionFactory();
		
		//getting session object
		Session session = sessionFactory.openSession();
		
		//getting session object
		
		Transaction tx = session.beginTransaction();
		
		//save object to table
		session.save(p1);
		session.save(p2);
		
		//committing the transaction
		tx.commit();
		
		//closing the session
		session.close();
		System.out.println("Product saved successfully");
	}

}
