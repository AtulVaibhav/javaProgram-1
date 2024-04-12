package com.loops;

public class Program1 {
    public static void printEvenNumber(){
    	for(int i=1;i<=50;i++){
    		if(i%2==0){
    			System.out.print(i+"  ");
    		}
    	}
    }
    
    public static int getFactorial(int num){
    	int fact = 1;
    	for(int i=1;i<=num;i++){
    		fact = fact *i;
    	}
    	return fact;
    }
    public static int getPower(int m,int n){
    	int exponent = 1;
    	for(int i=1;i<=n;i++){
    		exponent = exponent * m;
    	}
    	return exponent;
    }

	public static void main(String[] args) {
		//printEvenNumber();
		//System.out.println(getFactorial(5));
		System.out.println(getPower(2,5));
	}

}
