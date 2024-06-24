package com.hibernateCrud;

public class Main {

	public static void main(String[] args) {
		Product p = new Product("Samsung-Galaxy","Mobile",120000);
		Product p2 = new Product("Samsung-S8","Mobile",100000);
		Product p3 = new Product("Hp-laptops","Laptop",92000);
		
//		System.out.println( ProductUtil.addProduct(p));
//		System.out.println( ProductUtil.addProduct(p2));
//		System.out.println( ProductUtil.addProduct(p3));
		
//		Product savedProduct = ProductUtil.getProductById(101);
//		if(savedProduct!=null) {
//			System.out.println(savedProduct.getProductName()
//					+" "+savedProduct.getCategory()+" "+savedProduct.getProductPrice());
//			
//		}else {
//			System.out.println("No product found");
//		}
		
//		Product updatedProduct = new Product("Iphone-15","Mobile",130000);
//		System.out.println(ProductUtil.updateProduct(101, updatedProduct));

	
	    System.out.println(ProductUtil.deleteProduct(301));
	}

}
