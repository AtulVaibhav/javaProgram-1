package com.if_else;

import java.util.Scanner;

class DB{
	public static final int storedUsername = 1234;
	public static final int storedPassword = 8792;
}

class LoginSystem{
	public static void loginCredential(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your username");
		int userName = sc.nextInt();
		if(userName==DB.storedUsername){
			System.out.println("Enter your password");
			int password = sc.nextInt();
			if(password==DB.storedPassword){
				 System.out.println("Welcome user");
			}else{
				System.out.println("Username is valid but password is wrong");
			}
		}else{
			System.out.println("Username is not correct");
		}
		
	}
}

public class Test6 {

	public static void main(String[] args) {
		LoginSystem.loginCredential();

	}

}
