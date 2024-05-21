package com.multiThreading.concepts;


class A extends Thread{
	public void run(){
		System.out.println("Thread inside run() :"+
			      Thread.currentThread().getName());
	}
}
public class Test2 {

	public static void main(String[] args) {
		System.out.println("Thread inside main() :"+Thread.currentThread().getName());
		A a = new A();
		a.start();
		

	}

}
