package com.multiThreading.executorService;


import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

class TA implements Callable<String>{
  private int number;
  TA(int number){
	  this.number = number;
  }
  
	@Override
	public String call() throws Exception {
		for(int i=number*100;i<=number*100+99;i++){
			continue;
		}
		return "TA-"+number+" completed";
	}
	
}


public class ExecutorService_V {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		ExecutorService executorService = Executors.newFixedThreadPool(3);
		List<Callable<String>> tasks = 
				Arrays.asList(new TA(1),new TA(2),new TA(3));
		
//		List<Future<String>> taskResult = executorService.invokeAll(tasks);
//		for(Future<String> result:taskResult){
//			System.out.println(result.get());
//		}
		
		String result = executorService.invokeAny(tasks);
		System.out.println(result);
		
			executorService.shutdown();	

	}

}
