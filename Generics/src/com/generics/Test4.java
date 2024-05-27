package com.generics;


class Operation{
	public static<T> void addOperation(T obj1,T obj2) {
		if(obj1 instanceof Integer && obj2 instanceof Integer) {
			System.out.println((int)obj1+(int)obj2);
		}else {
			System.out.println((String)obj1 + (String) obj2);
		}
	}
}
public class Test4 {

	public static void main(String[] args) {
		int a = 20;
		int b = 30;
		Operation.addOperation(a,b);
		
		String obj1 = "hello";
		String obj2 = "Java";
		Operation.addOperation(obj1,obj2);
		
		
		

	}

}
