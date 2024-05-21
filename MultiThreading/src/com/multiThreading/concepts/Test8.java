package com.multiThreading.concepts;

public class Test8 implements Runnable{
	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName());
		
	}

	public static void main(String[] args) {
		Thread t1 = new Thread(new Test8());
		t1.setName("Thread-A");
		t1.start();

	}

	

}
