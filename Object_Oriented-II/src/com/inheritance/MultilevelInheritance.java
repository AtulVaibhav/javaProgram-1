package com.inheritance;

class Vehicle{
	public String getEngineType(){
		return "petrol-engine";
	}
}

class FourWheeler extends Vehicle{
	public int getNumberOfWheels(){
		return 4;
	}
}

class Car extends FourWheeler{
	public String getName(){
		return "Lamborgini";
	}
}
public class MultilevelInheritance {

	public static void main(String[] args) {
		Car car = new Car();
		System.out.println(car.getName());
		System.out.println(car.getNumberOfWheels());
		System.out.println(car.getEngineType());

	}

}
