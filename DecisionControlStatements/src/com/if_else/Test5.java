package com.if_else;

public class Test5 {
   public void isPositiveEvenNumber(int num){
	   if(num>0){
		   if(num%2==0){
			  System.out.println("Number is a positive even number"); 
		   }else{
			   System.out.println("Number is positive but not even");
		   }
	   }else{
		   System.out.println("Number is not positive");
	   }
   }
	public static void main(String[] args) {
		new Test5().isPositiveEvenNumber(23);

	}

}
