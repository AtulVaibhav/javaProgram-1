package com.loops;

public class Test2 {
   public static void getSumOfDigits(int num){
	   int sum=0;
	   while(num>0){
	   int rem = num%10;
	   num = num/10;
	   sum = sum+ rem;
	   }
	   System.out.println(sum);
   }
	public static void main(String[] args) {
		getSumOfDigits(52394);

	}

}
