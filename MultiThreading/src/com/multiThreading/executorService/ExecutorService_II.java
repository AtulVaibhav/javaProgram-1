package com.multiThreading.executorService;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class Tasks implements Runnable{
	private int number;
    Tasks(int number){
    	this.number = number;
    }
	@Override
	public void run() {
		System.out.println("Task"+this.number+" started by "
	                        +Thread.currentThread().getName());
		
		for(int i=number*100;i<=number*100+99;i++){
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		System.out.println("Task"+this.number+" completed by "
                +Thread.currentThread().getName());
		
	}
	
}


public class ExecutorService_II {

	public static void main(String[] args) {
		ExecutorService executorService = Executors.newFixedThreadPool(2);
		executorService.execute(new Tasks(1));
		executorService.execute(new Tasks(2));
		executorService.execute(new Tasks(3));
		executorService.shutdown();
	}

}
