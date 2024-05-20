package com.exception;

public class Test1 {
    public  static void m1(){
    	System.out.println("Statement 1");
    	System.out.println("Statement 2");
    	System.out.println(12/0);//exception
    	System.out.println("Statement 3");
    	System.out.println("Statement 4");
    }
	public static void main(String[] args) {
		m1();

	}

}
