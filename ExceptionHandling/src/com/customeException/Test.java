package com.customeException;

class AgeVerificationException extends Exception{
	
}
public class Test {
    public static void ageVerification(int age){
    	if(age>=18){
    		System.out.println("Welcome");
    	}else{
    		try{
    		throw new AgeVerificationException();
    		}catch(AgeVerificationException a){
    			System.out.println("Age verification failed");
    		}
    	}
    }
	public static void main(String[] args) {
		ageVerification(16);
	}

}
