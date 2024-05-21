package com.association;

public class Main {

	public static void main(String[] args) {
		Address a1 = new Address(101,"Bangalore","Karnataka","India");
		Employee emp = new Employee(10001,"Aman",a1);
		emp.empDetails();

	}

}
