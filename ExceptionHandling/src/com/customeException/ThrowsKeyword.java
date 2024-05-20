package com.customeException;

public class ThrowsKeyword {
    public static void m1(int age) throws AgeVerificationException{
    	if(age<18){
    		throw new AgeVerificationException();
    	}else{
    		System.out.println("Welcome");
    	}
    }
	public static void main(String[] args) throws AgeVerificationException {
		m1(16);

	}

}
