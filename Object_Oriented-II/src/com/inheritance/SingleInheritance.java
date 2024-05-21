package com.inheritance;

class Animal{
	public String getType(){
		return "Four-footed Animal";
	}
}

class Dog extends Animal{
	public String sound(){
		return "Dog barks";
	}
}

public class SingleInheritance {

	public static void main(String[] args) {
		Dog dog = new Dog();
		System.out.println(dog.getType());
        System.out.println(dog.sound());
	}

}
