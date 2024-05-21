package com.encapsulation;

class Pin{
	private final String pin = "abcd123";
	public String getPin(){
		return this.pin;
	}
}
public class Test2 {

	public static void main(String[] args) {
		Pin pin = new Pin();
		System.out.println(pin.getPin());
	}

}
