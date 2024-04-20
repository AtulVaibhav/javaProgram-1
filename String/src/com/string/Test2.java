package com.string;

class A{
	int data=30;
	
	@Override
	public String toString(){
		return ""+this.data;
	}
}

public class Test2 {

	public static void main(String[] args) {
	A obj = new A();
	System.out.println(obj);
	
	String str = "Java";
	System.out.println(str);
	
	

	}

}
