package com.multiThreading.concepts;

public class Test4 {

	public static void main(String[] args) {
		Thread t1 = new Thread() {
			public void run(){
				System.out.println("Thread inside run() :"+
					      Thread.currentThread().getName());
			}
		};
		t1.start();
		
//		(()->new Thread(){
//			public void run(){
//				System.out.println("Thread inside run() :"+
//					      Thread.currentThread().getName());
//			}
//		}.start());

	}

}
