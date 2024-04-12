package com.learning;

class Animal{
	Animal(){
		this(10);
		System.out.println("zero-arg constructor called");
	}
	
	Animal(int a){
		//this();
		System.out.println("one-arg constructor called");
	}
}

public class This_IV {

	public static void main(String[] args) {
		Animal animal  = new Animal();
			
          
	}

}
