package com.flightBookingApp;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class FlightController {
	static Map<String,Integer> map = new LinkedHashMap<>();
   public static void searchFlight(String userName,Scanner sc) throws ClassNotFoundException, SQLException, InterruptedException {
	   Connection con = UserController.getConnection();
	   String query = "select * from flights where src=? and destination=?";
	   PreparedStatement ps = con.prepareStatement(query);
	   System.out.println("Welcome "+userName);
	   System.out.println("Enter the src");
	   String src = sc.next();
	   System.out.println("Enter the dest");
	   String dest = sc.next();
	   ps.setString(1,src);
	   ps.setString(2, dest);
	   ResultSet set = ps.executeQuery();
	   while(set.next()) {
		   map.put(set.getString(1), set.getInt(4));
	   }
	   System.out.println("Flight details:");
	   System.out.println(map);
	   System.out.println("Want to proceed?y/n");
	   char res = sc.next().charAt(0);
	   if(res=='y') {
		   System.out.println("Enter the flight number");
		   String flightNumber = sc.next();
		   System.out.println("Enter the seats to book");
		   int seatsRequired = sc.nextInt();
		   bookingTicket(userName,flightNumber,seatsRequired);
	   }else {
		   System.out.println("Thank you for visiting");
	   }     
   }
   
      public static void bookingTicket(String userName,String flightNumber,int seatsRequired) throws ClassNotFoundException, SQLException, InterruptedException {
    	  int availableSeats=0;
    	  System.out.println("Checking for availability...Please wait");
    	  Thread.sleep(2000);
    	  Connection con = UserController.getConnection();
    	  String query ="select seat from flights where flight_number=?";
    	  PreparedStatement ps = con.prepareStatement(query);
    	  ps.setString(1, flightNumber);
    	  ResultSet set = ps.executeQuery();
    	  while(set.next()) {
    		  availableSeats = set.getInt(1);
    		  System.out.println(availableSeats);
    	  }
    	  if(availableSeats>=seatsRequired) {
    		  System.out.println("Seats confirmed");

    		  String query2 = "update flights set seat=? where flight_number=?";
    		  PreparedStatement ps2 = con.prepareStatement(query2);
    		  ps2.setInt(1, availableSeats-seatsRequired);
    		  ps2.setString(2, flightNumber);
    		  
    		  ps2.executeUpdate();
    		  
    		  
    		  System.out.println("Please wait to get boarding pass");
    		  Thread.sleep(2000);
    		  
    		  String query3 ="select * from flights where flight_number=?";
    
    		  PreparedStatement ps3 = con.prepareStatement(query3);
    		  ps3.setString(1, flightNumber);
    		  ResultSet result =ps3.executeQuery();
    		  
    		  String flight_Number=null,source=null,destination=null;
    		  while(result.next()) {
    			  flight_Number = result.getString(1);
    			  source = result.getString(2);
    			  destination = result.getString(3);
    		  }
    		  
    		  System.out.println("Your boarding pass:");
    		  System.out.println("PassengerName :"+userName+
    				  " Flight Number :"+flight_Number+
    				  " From :"+source+
    				  " To :"+destination);
    		  
    		  
    		  System.out.println("Happy Journey..");
    	  }else {
    		  System.out.println("Booking failed..Seats not available");
    	  }
    	  
    	  
    	  
    	  
    	  
      }
   
   
}
