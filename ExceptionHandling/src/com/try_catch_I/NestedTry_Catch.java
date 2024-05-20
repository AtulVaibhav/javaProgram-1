package com.try_catch_I;

public class NestedTry_Catch {
   public static void m1(){
	   try{
		   System.out.println("Inside outer try-block");
		   //int result =12/0;
		   try{
			   System.out.println("Inside inner try-block");
			   String str=null;
			   System.out.println(str.length());
		   }catch(Exception e){
			   System.out.println("Exception handled in inner-catch");
		   }
	   }catch(Exception e){
		   System.out.println("Exception handled in outer-catch block");
	   }
	   
	   System.out.println("Outside nested try-catch");
   }
	public static void main(String[] args) {
		m1();

	}

}
