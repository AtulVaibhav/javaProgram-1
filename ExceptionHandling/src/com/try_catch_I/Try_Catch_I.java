package com.try_catch_I;

public class Try_Catch_I {
   public static void m1(){
	   System.out.println("Hello");
	   
	   
	   try{
	      System.out.println(12/0);
	   }catch(ArithmeticException ae){
		  System.out.println("Can't divide a number by 0"); 
	   }
	   System.out.println("Hello");
	   System.out.println("Hello");
   }
	public static void main(String[] args) {
		m1();

	}

}
