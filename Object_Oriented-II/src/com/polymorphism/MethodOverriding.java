package com.polymorphism;

class Parent{
	public String study(){
		return "9:00PM - 00:00AM";
	}
//	public void m2(){
//		
//	}
}

class Child extends Parent{
	@Override
	public String study(){
		return "Who cares";
	}
}
public class MethodOverriding {

	public static void main(String[] args) {
		Child ch = new Child();
		System.out.println(ch.study());
		//ch.m2();

	}

}
