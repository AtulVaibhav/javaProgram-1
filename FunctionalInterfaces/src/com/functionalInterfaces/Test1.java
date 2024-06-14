package com.functionalInterfaces;

@FunctionalInterface
interface MyInterface{
	int data=100;
	void m1();
	public default void show() {
		System.out.println("Hello interface");
	}
	public static void msg() {
		System.out.println("Good afternoon");
	}
	
}

class MyInterfaceImpl implements MyInterface {

	@Override
	public void m1() {
		System.out.println("method implemented");
		
	}
	
}

public class Test1 {

	public static void main(String[] args) {
		MyInterface myInterface = new MyInterfaceImpl();
		myInterface.show();
		myInterface.m1();
		
		MyInterface.msg();
		System.out.println(MyInterface.data);
       // MyInterface.data = 200;		

	}

}
