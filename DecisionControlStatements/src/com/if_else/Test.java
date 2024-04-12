package com.if_else;

//WAp to find the largest number among two given numbers
public class Test {
    public void largestNumber(int a,int b){
    	if(a>b){
    		System.out.println(a+" is greater than "+b);
    	}else{
    		System.out.println(b+" is greater than "+a);
    	}
    }
	public static void main(String[] args) {
        Test obj = new Test();
        obj.largestNumber(12, 13);
	}

}
