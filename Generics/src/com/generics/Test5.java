package com.generics;

public class Test5 {
   public static<T extends Number> void getSum(T obj,T obj2) {
	   System.out.println(obj.doubleValue() + obj2.doubleValue());
   }
	public static void main(String[] args) {
		getSum(12,13);
		getSum(11.23,12.23);
		getSum(1.2f,2.3f);
		//getSum("Hello","Java");

	}

}
