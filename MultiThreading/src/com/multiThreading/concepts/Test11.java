package com.multiThreading.concepts;


class SharedResource{
	public void print(){
		System.out.println(Thread.currentThread().getName()+" started...");
	  for(int i=1;i<=99;i++){
		  continue;
	  }
	
	  System.out.println(Thread.currentThread().getName()+" completed.");
	}
}
public class Test11 {

	public static void main(String[] args) throws InterruptedException {
		System.out.println("Main thread started..");
		SharedResource sharedResource = new SharedResource();
		Thread t1 = new Thread(){
			public void run(){
				sharedResource.print();
			}
		};
		Thread t2 = new Thread(){
			public void run(){
				sharedResource.print();
			}
		};
		
		t1.setName("A");
		t2.setName("B");
		
		t2.start();
		t2.join();
		
		
		t1.start();
		t1.join();
		
		
		
		System.out.println("Main thread completed.");
		
		

	}

}
