package com.tightcoupling;

public class Main {

	public static void main(String[] args) {
		Airtel airtel = new Airtel();
		JIO jio= new JIO();
		
		Mobile mobile =new Mobile(jio);
          System.out.println(mobile.getServiceName());
	}

}
