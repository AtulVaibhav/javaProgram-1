package com.flightBookingApp;

import java.sql.SQLException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws ClassNotFoundException, InterruptedException, SQLException {
		Scanner sc = new Scanner(System.in);
		boolean islogin = false;
		LoggedInUser obj=null;
		System.out.println("Welcome to FlightApp");
		System.out.println("Choose the option to proceed");
		System.out.println("1.Registration    2.Login");
		int option = sc.nextInt();
		switch(option) {
		case 1: UserController.registration(sc);
		        
		        
		case 2: 
			  obj = UserController.login(sc);
			 
		     break;
		default:System.out.println("Invalid option");
		}
		
		if(obj!=null && obj.isLoginStatus()) {
			FlightController.searchFlight(obj.getLoggedInUser(),sc);
			
		}else {
			System.out.println("Login first");
		}
		
		
		

	}

}
