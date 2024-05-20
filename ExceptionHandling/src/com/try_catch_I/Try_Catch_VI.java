package com.try_catch_I;

public class Try_Catch_VI {
   public static int getData(int a,int b){
	   int result=0;
	   try{
		   result= a/b;
	   }catch(Exception e){
		   return -1;
	   }
	   return result;
   }
	public static void main(String[] args) {
		System.out.println(getData(12,0));

	}

}
