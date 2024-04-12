package com.if_else;

public class Test3 {
   public void isPositiveEvenNumber(int number){
	   if(number>0 && number%2==0){
		   System.out.println(number +" is a positive even number");
	   }else{
		   System.out.println(number +" is not a positive even number");
	   }
   }
	public static void main(String[] args) {
		Test3 obj = new Test3();
		obj.isPositiveEvenNumber(-24);

	}

}
