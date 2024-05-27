package com.multiThreading.executorService;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class Task implements Runnable{

	@Override
	public void run() {
		System.out.println("Task started..");
		for(int i=1;i<=99;i++){
			try {
				Thread.sleep(50);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			continue;
		}
		System.out.println("Task completed.");
		
	}
	
}


public class ExecutorService_I {

	public static void main(String[] args) {
	 ExecutorService executorService = Executors.newSingleThreadExecutor();
	 executorService.execute(new Task());
     executorService.shutdown();
	}

}
