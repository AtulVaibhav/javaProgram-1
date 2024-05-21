package com.multiThreading.concepts;


class TA extends Thread{
	public void run(){
		System.out.println("Thread-A started...");
		for(int i=1;i<=99;i++){
			continue;
		}
		System.out.println("Thread-A completed.");
	}
}
public class Test10 {

	public static void main(String[] args) throws InterruptedException {
		System.out.println("Main started...");
		TA t = new TA();
		
		t.start();
		t.join();
		System.out.println("Main completed.");

	}

}
