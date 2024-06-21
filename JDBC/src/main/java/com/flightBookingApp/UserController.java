package com.flightBookingApp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class UserController {
	private static final String url = "jdbc:mysql://localhost:3306/ flightapp";
	private static final String username = "root";
	private static final String password = "root";

	private static Connection con = null;

	public static Connection getConnection() throws SQLException, ClassNotFoundException {
		if (con == null) {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection(url, username, password);
		}
		return con;
	}

	public static void registration(Scanner sc) throws InterruptedException, ClassNotFoundException, SQLException {
		System.out.println("Enter the userId");
		int userId = sc.nextInt();
		System.out.println("Enter the username");
		String userName = sc.next();
		System.out.println("Enter the password");
		String password = sc.next();

		System.out.println("Please wait..Connecting to server");
		Thread.sleep(1000);
		PreparedStatement ps = getConnection().prepareStatement("insert into user value (?,?,?)");
		ps.setInt(1, userId);
		ps.setString(2, userName);
		ps.setString(3, password);

		int i = ps.executeUpdate();
		if (i > 0) {
			System.out.println("Registration successfull");
		} else {
			System.out.println("Registration failed");
		}
	}

	public static LoggedInUser login(Scanner sc) throws InterruptedException, ClassNotFoundException, SQLException {
		LoggedInUser loggedUser = new LoggedInUser();
		String storedUser=null;
		String storedPassword=null;
		System.out.println("Please process for login");
		System.out.println("Enter the username");
		String username = sc.next();
		System.out.println("Enter the password");
		String password = sc.next();

		System.out.println("Please wait..Validating user data");
		Thread.sleep(2000);

		PreparedStatement ps = getConnection().prepareStatement("select * from user where userName=?");
		ps.setString(1, username);
		try {
			ResultSet result = ps.executeQuery();
			while(result.next()) {
			 storedUser = result.getString(2);
			
	         storedPassword = result.getString(3);
	      
			}

			if (storedUser.equals(username) && storedPassword.equals(password)) {

				loggedUser.setLoggedInUser(username);
				loggedUser.setLoginStatus(true);
                return loggedUser;
			}

		} catch (Exception ex) {
			System.out.println("User not found");
		}
		return null;

	}

}
