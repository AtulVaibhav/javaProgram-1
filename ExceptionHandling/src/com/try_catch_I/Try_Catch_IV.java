package com.try_catch_I;

public class Try_Catch_IV {
	public static void m1(){
		try{
			String str =null;
			System.out.println(str.length());//NullPointer
		}catch(ArrayIndexOutOfBoundsException ae){
			System.out.println("Exception handled successfully");
		}
		
	     System.out.println("Outside try-catch");
	   }
	public static void main(String[] args) {
		m1();

	}

}
