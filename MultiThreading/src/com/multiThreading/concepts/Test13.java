package com.multiThreading.concepts;

class SharedData2{
	public void m1() throws InterruptedException{
		System.out.println("m1() method start executing..");
		synchronized (this) {
			System.out.println(Thread.currentThread().getName()
					+" started...");
			for(int i=1;i<=99;i++){
				Thread.sleep(50);
				continue;
			}
			System.out.println(Thread.currentThread().getName()
					+" completed");
		}
		System.out.println("m1() method completed");
	}
}


public class Test13 {

	public static void main(String[] args) {
		SharedData2 sharedData2 = new SharedData2();
		Thread t1 = new Thread(){
			public void run(){
				try {
					sharedData2.m1();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		};
		
		Thread t2 = new Thread(){
			public void run(){
				try {
					sharedData2.m1();
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
