package com.abstraction;


abstract class Transport{
	public abstract int speed();
	
	public void getCompany(){
		System.out.println("VRL");
	}
}
abstract class FourWheeler extends Transport{
	
}
class Car extends FourWheeler{
	public int speed(){
		return 120;
	}
}

class Bus extends FourWheeler{
	public int speed(){
		return 220;
	}
}

abstract class A{
	
}

public class Main {

	public static void main(String[] args) {
		//Transport t = new Transport();
		Car c = new Car();
		System.out.println("Car speed :"+c.speed());
		
		Bus bus = new Bus();
		System.out.println("Bus speed :"+bus.speed());

		//A obj = new A();
	}

}
