package com.comparatorinterface;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;



public class Test {

	public static void main(String[] args) {
		Product p1 = new Product(101, "Laptop", 97000);
		Product p2 = new Product(102, "Mobiles", 107000);
		Product p3 = new Product(103, "Tv", 55000);
		Product p4 = new Product(104, "Tablets", 127000);
      
		List<Product> list = Arrays.asList(p1,p2,p3,p4);
		
		System.out.println("Sorted product based on name");
         Collections.sort(list, new SortByName());
		
		System.out.println(list);
		
		System.out.println("________________________________");
		System.out.println("Sorted products based on price");
		 Collections.sort(list, new SortByPrice());
			
			System.out.println(list);

	}

}
