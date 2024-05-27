package com.multiThreading.concepts;


class WritingResource{
	public static final String resource1 = "PEN";
	public static final String resource2 = "PAPER";
}


public class Test15 {

	public static void main(String[] args) {
        Thread t1 = new Thread(){
        	public void run(){
        		synchronized (WritingResource.resource1) {
					System.out.println(Thread.currentThread().getName()+
							" acquired "+WritingResource.resource1);
					System.out.println(Thread.currentThread().getName()+
							" waiting for "+WritingResource.resource2);
					
					synchronized (WritingResource.resource2) {
						System.out.println(Thread.currentThread().getName()+
							" acquired "+WritingResource.resource2);
						System.out.println("Task completed by "+Thread.currentThread().getName());
					}
				}
        	}
        };
        
        Thread t2 = new Thread(){
        	public void run(){
        		synchronized (WritingResource.resource2) {
        			System.out.println(Thread.currentThread().getName()+
							" acquired "+WritingResource.resource2);
					System.out.println(Thread.currentThread().getName()+
							" waiting for "+WritingResource.resource1);
					
					synchronized (WritingResource.resource1) {
						System.out.println(Thread.currentThread().getName()+
								" acquired "+WritingResource.resource1);
							System.out.println("Task completed by "+Thread.currentThread().getName());
						
					}
					
				}
        	}
        };
        
        
        t1.setName("A");
        t2.setName("B");
        
        
        t1.start();
        t2.start();

	}

}
