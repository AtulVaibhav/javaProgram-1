package com.loosecoupling;


public class Test {

	public static void main(String[] args) {
		Airtel airtel = new Airtel();
		JIO jio= new JIO();
		Vodafone vodafone =new Vodafone();

		Mobile mobile = new Mobile(vodafone);
		System.out.println(mobile.getServices());

	}

}
