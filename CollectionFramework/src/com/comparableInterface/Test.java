package com.comparableInterface;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Test {

	public static void main(String[] args) {
		Product p1 = new Product(101, "Laptop", 97000);
		Product p2 = new Product(102, "Mobiles", 107000);
		Product p3 = new Product(103, "TV", 55000);
		Product p4 = new Product(104, "Tablets", 127000);
      
		List<Product> list = Arrays.asList(p1,p2,p3,p4);
		System.out.println(list);
		
		Collections.sort(list);
		System.out.println("___________After sorting based on price_____________");
		System.out.println(list);
	}

}
