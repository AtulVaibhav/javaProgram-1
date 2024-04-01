package com.learning;

class Box{
	//dt varName = value;
	int length = 20;//instance variable
	
}


public class Variable_I {

	public static void main(String[] args) {
		Box b1 = new Box();
		Box b2 = new Box();
		Box b3 = new Box();
		//objectName.varName
		System.out.println(b1.length);
		
		System.out.println("_________________________");
		System.out.println("before modification");
		System.out.println(b1.length);
		System.out.println(b2.length);
		System.out.println(b3.length);
		System.out.println("_________________________");
		System.out.println("after modification");
		b1.length=40;
		System.out.println(b1.length);
		System.out.println(b2.length);
		System.out.println(b3.length);

	}

}
