package com.inheritance;

class Base{
	Base(int a){
		System.out.println("Base class constructor");
	}
}

class Derived extends Base{
	Derived(){
		super(10);
		System.out.println("Derived class constructor");
	}
}

public class Main2 {

	public static void main(String[] args) {
		Derived derived = new Derived();
		

	}

}
