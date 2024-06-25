package com.hibernateCrud;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class ProductUtil {
   private static SessionFactory factory = null;
	private static SessionFactory getSessionFactory() {
		if(factory==null) {
		   factory = new Configuration()
				     .configure()
				     .buildSessionFactory();
		}
		return factory;
	}
	
	public static String addProduct(Product p) {
		Session session = getSessionFactory().openSession();
		session.beginTransaction();
	    session.save(p);
		session.getTransaction().commit();
		session.close();
		return "Product added successfully";
	}
	
	public static Product getProductById(int productId) {
		Session session = getSessionFactory().openSession();
		Product product = 	session.get(Product.class, productId);
		session.close();
		return product;
		
	}
	
	public static String updateProduct(int productId,Product updatedProduct) {
		Session session = getSessionFactory().openSession();
		Product savedProduct = session.get(Product.class, productId);
		if(savedProduct!=null) {
			session .beginTransaction();
			savedProduct.setProductId(productId);
			savedProduct.setProductName(updatedProduct.getProductName());
			savedProduct.setCategory(updatedProduct.getCategory());
			savedProduct.setProductPrice(updatedProduct.getProductPrice());
			
			session.save(savedProduct);
			session.getTransaction().commit();
			session.close();
			return "Product updated successfully";
			
  		}
		session.close();
		return "No product found";
	}
	
	public static String deleteProduct(int productId) {
		Session session = getSessionFactory().openSession();
		Product product = session.get(Product.class, productId);
		if(product!=null) {
			session.beginTransaction();
			session.delete(product);
			session.getTransaction().commit();
			session.close();
			return "Product deleted successfully";
		}
		session.close();
		return "No product found";
	}
	
	
	
	
	
	
}
