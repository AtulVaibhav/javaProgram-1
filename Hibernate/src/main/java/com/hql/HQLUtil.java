package com.hql;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;



public class HQLUtil {
	private static SessionFactory sessionFactory = null;
	
	private static SessionFactory buildSessionFactory() {
		if(sessionFactory==null) {
			sessionFactory = new Configuration()
					.configure().buildSessionFactory();
			
		}
		return sessionFactory;	
	}
	
	public static void addProduct(Product product) {
		Session session = buildSessionFactory().openSession();
		session.beginTransaction();
		session.save(product);
		session.getTransaction().commit();
		System.out.println("Product saved successfully");
	}
	
	
	public static void readProducts() {
		Session session = buildSessionFactory().openSession();
		String hql = "from Product";
		Query<Product> query = session.createQuery(hql);
		List<Product> list = query.list();
		System.out.println(list);
	}
	
	public static void getProductById(int productId) {
		Session session = buildSessionFactory().openSession();
		String hql = "from Product as p where p.productId=:id";
		Query<Product> query = session.createQuery(hql);
		query.setInteger("id", productId);
		List<Product> list =  query.list();
		System.out.println(list.get(0));
	}
	
	public static void updateProduct(int productId,Product product) {
		Session session = buildSessionFactory().openSession();
		session.beginTransaction();
		String hql = "update Product as p set p.productPrice=:price where p.productId=:id";
		Query<Product> query = session.createQuery(hql);
		query.setDouble("price", product.getProductPrice());
		query.setInteger("id", productId);
		int i = query.executeUpdate();
		session.getTransaction().commit();
		
		System.out.println(i+" row affected");
	
	}
	
	public static void deleteProduct(int productId) {
		Session session = buildSessionFactory().openSession();
		session.beginTransaction();
		String hql = "delete from Product where productId=:id";
		Query<Product> query = session.createQuery(hql);
		query.setInteger("id", productId);
		int i = query.executeUpdate();
		session.getTransaction().commit();
		System.out.println("product deleted successfully");
		
		
		
	}
	
	
	
	
	
	
	
	

}
