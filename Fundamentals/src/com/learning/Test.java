package com.learning;


class Car{
	int numberOfWheels = 4;
	String color = "red";
}


public class Test {

	public static void main(String[] args) {
		//className objName = new ClassName();
		
		Car santro = new Car();
		System.out.println(santro);
		System.out.println(santro.numberOfWheels);
		System.out.println(santro.color);
		

	}

}
