package com.inheritance;

class Parent{
	int a = 10;
	public int b = 20;
	protected int c = 30;
	private int d = 40;
}

class Child extends Parent{
	public void showData(){
		System.out.println(a+" "+b+" "+c);
	}
}

public class Main {

	public static void main(String[] args) {
		Child ch = new Child();
		ch.showData();

	}

}
