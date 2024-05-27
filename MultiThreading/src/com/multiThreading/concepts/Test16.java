package com.multiThreading.concepts;

class WatchMovie{
	static int amount =1500;
	public synchronized void buyingTicket(int requiredAmount) throws InterruptedException{
		System.out.println(" Thread-A going to buy a ticket");
		if(requiredAmount > amount){
			System.out.println("Thread-A waiting for amount");
			wait();
		}
		System.out.println("Thread-A bought ticket.Enjoying my weekends");
	}
	
	
	public synchronized void depositAmount(int addingAmount){
		System.out.println("Thread-B depositing amount.");
		amount = amount+addingAmount;
		System.out.println("Thread-B deposited amount");
		notify();
		
	}
}


public class Test16 {

	public static void main(String[] args) throws InterruptedException {
		WatchMovie weekendTask = new WatchMovie();
		Thread t1 = new Thread(){
			public void run(){
				try {
					weekendTask.buyingTicket(2500);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				};
				
			}
		};
		
		Thread t2 = new Thread(){
			public void run(){
				weekendTask.depositAmount(1000);
			}
		};
       
		
		t1.start();
		//t1.join();
		
		t2.start();
		//t2.join();
	}

}
