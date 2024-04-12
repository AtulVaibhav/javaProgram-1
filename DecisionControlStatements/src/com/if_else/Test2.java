package com.if_else;

import java.util.Scanner;

public class Test2 {
   public void ageVerification(int age){
	   if(age>=18){
		   System.out.println("Welcome to online voting system");
	   }else{
		   System.out.println("age verification failed");
	   }
   }
	public static void main(String[] args) {
		Test2 obj = new Test2();
		Scanner sc  = new Scanner(System.in);
		System.out.println("Enter the age ");
		int age = sc.nextInt();
		
		obj.ageVerification(age);

	}

}
