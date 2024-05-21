package com.multiThreading.concepts;

class SharedOperation{
	public void printTable(int num){
		for(int i=1;i<=10;i++){
			System.out.println(num+" X "+i+"="+(num*i));
		}
	}
}

class T1 implements Runnable{
   private SharedOperation sharedOperation;
   
	public T1(SharedOperation sharedOperation) {
	super();
	this.sharedOperation = sharedOperation;
}

	@Override
	public void run() {
		this.sharedOperation.printTable(2);
		
	}
	
}

class T2 implements Runnable{
	   private SharedOperation sharedOperation;
	   
		public T2(SharedOperation sharedOperation) {
		super();
		this.sharedOperation = sharedOperation;
	}

		@Override
		public void run() {
			this.sharedOperation.printTable(2);
			
		}
		
	}
public class Test7 {

	public static void main(String[] args) {
		SharedOperation sharedOperation = new SharedOperation();
	  Thread t1 = new Thread(new T1(sharedOperation));
	  Thread t2 = new Thread(new T2(sharedOperation));
	  
	  t1.start();
	  t2.start();

	}

}
