package com.multiThreading.concepts;


class SharedData3{
	public static synchronized void m1() throws InterruptedException{
		System.out.println(Thread.currentThread().getName()+" started...");
		for(int i=1;i<=99;i++){
			Thread.sleep(50);
			continue;
		}
		System.out.println(Thread.currentThread().getName()+" completed");
	}
}
public class Test14 {

	public static void main(String[] args) {
		
		SharedData3 obj1 = new SharedData3();
		SharedData3 obj2 = new SharedData3();
		Thread t1 = new Thread(){
			public void run(){
				try {
					obj1.m1();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		};
		
		Thread t2 = new Thread(){
			public void run(){
				try {
					obj2.m1();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		};
		t1.setName("A");
		t2.setName("B");
		
		t1.start();
		t2.start();
		

	}

}
