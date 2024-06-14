package com.comparatorinterface;

import java.util.Comparator;



public class SortByPrice implements Comparator<Product>{

	@Override
	public int compare(Product o1, Product o2) {
		// TODO Auto-generated method stub
		return (int) (o1.getProductPrice() - o2.getProductPrice());
	}

}
