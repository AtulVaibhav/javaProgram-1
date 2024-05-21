package com.multiThreading.concepts;

public class Test1 {
    public static void m1(){
    	System.out.println("Current running thread :"+
      Thread.currentThread().getName());
    }
	public static void main(String[] args) {
		m1();

	}

}
