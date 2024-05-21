package com.encapsulation;

class Car{
	private int numberOfWheels;
	private String nameOfCar;
	
	public void setNumberOfWheels(int number){
		this.numberOfWheels = number;
	}
	
	public int getNumberOfWheels(){
		return this.numberOfWheels;
	}

	public String getNameOfCar() {
		return nameOfCar;
	}

	public void setNameOfCar(String nameOfCar) {
		this.nameOfCar = nameOfCar;
	}
}

//AlT + Shift + S

public class Test {

	public static void main(String[] args) {
		Car car = new Car();
//		car.numberOfWheels = 4;
        //car.setNumberOfWheels(4);
       // System.out.println(car.numberOfWheels);
        System.out.println(car.getNumberOfWheels());
        System.out.println(car.getNameOfCar());
	}

}
