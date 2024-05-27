package com.multiThreading.executorService;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class T1 implements Callable<String>{

	@Override
	public String call() throws Exception {
		for(int i=1;i<=100;i++){
			Thread.sleep(10);
			continue;
		}
		return "T1 completed";
	}
	
}
class T2 implements Callable<String>{

	@Override
	public String call() throws Exception {
		for(int i=1;i<=50;i++){
			Thread.sleep(10);
			continue;
		}
		return "T2 completed";
	}
	
}

class T3 implements Callable<String>{

	@Override
	public String call() throws Exception {
		for(int i=1;i<=70;i++){
			Thread.sleep(10);
			continue;
		}
		return "T3 completed";
	}
	
}


public class ExecutorService_IV {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		ExecutorService executorService = Executors.newFixedThreadPool(3);
		System.out.println(executorService.submit(new T1()).get());
		System.out.println(executorService.submit(new T2()).get());
		System.out.println(executorService.submit(new T3()).get());
		executorService.shutdown();
	}

}
