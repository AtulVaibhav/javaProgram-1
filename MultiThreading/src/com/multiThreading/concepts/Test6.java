package com.multiThreading.concepts;

public class Test6 {

	public static void main(String[] args) {
		Thread t1 = new Thread(){
			public void run(){
				for(int i=1;i<=5;i++){
					System.out.println("Hello");
				}
			}
		};
		t1.start();
		//t1.start();//java.lang.IllegalThreadStateException

	}

}
