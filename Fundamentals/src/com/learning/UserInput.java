package com.learning;

import java.util.Scanner;

class Car2{
	int carId;
	String carName;
	String carColor;
	
	Car2(int id,String name,String color){
		carId = id;
		carName = name;
		carColor = color;
	}
	
	public void showDetails(){
		System.out.println("Id :"+carId);
		System.out.println("Name :"+carName);
		System.out.println("Color :"+carColor);
	}
}


public class UserInput {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the id of a car");
		int id = sc.nextInt();
		System.out.println("Enter the name of a car");
		String name = sc.next();
		System.out.println("Enter the color of a car");
		String color = sc.next();
		
		Car2 c1 = new Car2(id,name,color);
		c1.showDetails();

	}

}
