package com.setterInjection_II;

public class User {
   private int userId;
   private String username;
public User() {
	super();
	// TODO Auto-generated constructor stub
}
public int getUserId() {
	return userId;
}
public void setUserId(int userId) {
	this.userId = userId;
}
public String getUsername() {
	return username;
}
public void setUsername(String username) {
	this.username = username;
}
@Override
public String toString() {
	return "User [userId=" + userId + ", username=" + username + "]";
}
   
   
}
