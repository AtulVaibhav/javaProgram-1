package com.onetomany;

import java.util.Arrays;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Main {

	public static void main(String[] args) {
		Product p1 = new Product();
		p1.setProductName("Iphone-15");
		p1.setProductUrl("p1Image");
		p1.setProductPrice(120000);
		
		Product p2 = new Product();
		p2.setProductName("Iphone-14");
		p2.setProductUrl("p2Image");
		p2.setProductPrice(100000);
		
		Product p3 = new Product();
		p3.setProductName("Iphone-13");
		p3.setProductUrl("p3Image");
		p3.setProductPrice(90000);
		
		Category mobiles = new Category();
		mobiles.setCategoryName("mobile");
		
		List<Product> listOfPhones = Arrays.asList(p1,p2,p3);
		mobiles.setProduct(listOfPhones);
		
		p1.setCategory(mobiles);
		p2.setCategory(mobiles);
		p3.setCategory(mobiles);
		
		Product l1 = new Product();
		l1.setProductName("HP-laptop");
		l1.setProductUrl("l1Image");
		l1.setProductPrice(87000);
		
		Product l2 = new Product();
		l2.setProductName("Dell-laptop");
		l2.setProductUrl("l2Image");
		l2.setProductPrice(57000);
		
		
		Category laptops = new Category();
		laptops.setCategoryName("laptop");
        
		List<Product> listOflaptops = Arrays.asList(l1,l2);
		laptops.setProduct(listOflaptops);
		
		l1.setCategory(laptops);
		l2.setCategory(laptops);
		
		SessionFactory factory = new Configuration()
				                .configure().buildSessionFactory();
		Session session = factory.openSession();
		session.beginTransaction();
		session.save(mobiles);
		session.save(laptops);
		
		session.getTransaction().commit();
		session.close();
		
		System.out.println("Category saved successfully");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
