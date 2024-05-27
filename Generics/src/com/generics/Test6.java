package com.generics;

import java.util.Arrays;
import java.util.List;

public class Test6 {
    public static void  print(List<? extends Number> list){
    	for(int i=0;i<list.size();i++) {
    		System.out.println(list.get(i));
    	}
    }
	public static void main(String[] args) {
		List<Double> list = Arrays.asList(1.2,2.3,3.4,4.5);
		print(list);
		
		List<Number> list2 = Arrays.asList(1,2,3);
		print(list2);
		
//		List<String> list2 = Arrays.asList("A","B","C");
//		print(list2);
		
		

	}

}
