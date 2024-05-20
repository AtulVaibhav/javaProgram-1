package com.try_catch_I;

public class Try_Catch_III {
   public static void m1(){
	try{
		int arr[] = {1,2,3};
		System.out.println(arr[3]);//ArrayIndexOutOfBoundsException
	}catch(ArrayIndexOutOfBoundsException ae){
		System.out.println("Exception handled successfully");
	}
	
     System.out.println("Outside try-catch");
   }
	public static void main(String[] args) {
		m1();

	}

}
