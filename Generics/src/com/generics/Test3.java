package com.generics;

import java.util.Arrays;
import java.util.List;

interface MyComparable<T>{
	int compareTo(T obj);
}

class Product implements MyComparable<Product>{
    public String productName;
    public  int productPrice;
    
    
	public Product(String productName, int productPrice) {
		super();
		this.productName = productName;
		this.productPrice = productPrice;
	}
	


	@Override
	public String toString() {
		return "Product [productName=" + productName + ", productPrice=" + productPrice + "]";
	}



	@Override
	public int compareTo(Product obj) {
		// TODO Auto-generated method stub
		return this.productPrice - obj.productPrice;
	}
	
}



public class Test3 {

	public static void main(String[] args) {
		Product p1 = new Product("Laptop",67000);
		Product p2 = new Product("Mobiles",46000);
		Product p3 = new Product("Tablets",57000);
		
		Product[] products = {p1,p2,p3};
		Arrays.sort(products,Product::compareTo);
		System.out.println(Arrays.toString(products));
		
		

	}

}
