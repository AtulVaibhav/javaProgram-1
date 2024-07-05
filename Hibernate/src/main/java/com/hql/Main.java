package com.hql;

public class Main {
public static void main(String[] args) {
	Product p1 = new Product("Laptop",78000);
	Product p2 = new Product("Mobile",89000);
//	HQLUtil.addProduct(p1);
//	HQLUtil.addProduct(p2);
	
//	HQLUtil.readProducts();
	
	HQLUtil.getProductById(1);
//	Product updatedProduct = new Product("Laptop",90000);
//	HQLUtil.updateProduct(1, updatedProduct);
	
//	HQLUtil.deleteProduct(2);
	
	
}
}
