package com.learning;

public class Method_I {
    public void m1(){
    	System.out.println("m1() executed");
    }
    
    public static void m2(){
    	System.out.println("m2() executed");
    }
	public static void main(String[] args) {
		Method_I obj = new Method_I();
		obj.m1();
		
		Method_I.m2();

	}

}
