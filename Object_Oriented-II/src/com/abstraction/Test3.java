package com.abstraction;

interface X{
	void m1();
}
interface Y{
	void m2();
}

interface Z extends X,Y{
	void m3();
}

class ZImpl implements Z{
	
	public void m1(){
		System.out.println("m1() called");
	}
	public void m2(){
		System.out.println("m2() called");
	}
	public void m3(){
		System.out.println("m3() called");
	}
}

public class Test3 {

	public static void main(String[] args) {
		ZImpl obj = new ZImpl();
		obj.m1();
		obj.m2();
		obj.m3();

	}

}
