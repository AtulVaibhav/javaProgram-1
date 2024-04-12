package com.if_else;

public class Test4 {
   public boolean isPrime(int num){
	   boolean isPrime = false;
	   for(int i=2;i<=num/2;i++){
		   if(num%i==0){
			   isPrime = true;
			   return isPrime;
		   }
	   }
	   return isPrime;
   }
	public static void main(String[] args) {
		Test4 obj = new Test4();
		boolean result = obj.isPrime(99);
		if(result){
			System.out.println("Number is not a prime number");
		}else{
			System.out.println("Number is a prime number");
		}

	}

}
