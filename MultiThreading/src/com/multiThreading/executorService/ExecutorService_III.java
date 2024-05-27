package com.multiThreading.executorService;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

class TaskA implements Callable<String>{

	@Override
	public String call() throws Exception {
		return "Task completed";
	}
	
}
public class ExecutorService_III {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
	ExecutorService executorService = Executors.newSingleThreadExecutor();
	Future<String> task = executorService.submit(new TaskA());
	System.out.println(task.get());
	executorService.shutdown();
	

	}

}
