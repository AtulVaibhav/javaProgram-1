package com.multiThreading.concepts;


class B implements Runnable{

	@Override
	public void run() {
		System.out.println("Thread inside run() :"+
			      Thread.currentThread().getName());	
	}
	
}
public class Test3 {

	public static void main(String[] args) {
		B b = new B();
		Thread th = new Thread(b);
		th.start();

	}

}
