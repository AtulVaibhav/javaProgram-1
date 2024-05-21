package com.multiThreading.concepts;

public class Test5 {

	public static void main(String[] args) {
		Thread t2 =new Thread(new Runnable(){

			@Override
			public void run() {
				System.out.println("Thread inside run() :"+
					      Thread.currentThread().getName());
				
			}
			
		});
		t2.start();
	}

}
