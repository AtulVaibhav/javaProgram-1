package com.polymorphism;


class Base{
	public void m1(){
		System.out.println("Hello fro Base");
	}
}

class Derived_I extends Base{
	@Override
	public void m1(){
		System.out.println("Hello from derived_I");
	}
}
class Derived_II extends Base{
	@Override
	public void m1(){
		System.out.println("Hello from derived_II");
	}
}
public class DynamicDispatch {

	public static void main(String[] args) {
		Base base = new Derived_I();
         base.m1();
	}

}
