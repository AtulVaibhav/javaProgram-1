package com.multiThreading.concepts;

class SharedData{
	public synchronized void m1() throws InterruptedException{
		System.out.println(Thread.currentThread().getName()
				+" started...");
		for(int i=1;i<=99;i++){
			Thread.sleep(50);
			continue;
		}
		System.out.println(Thread.currentThread().getName()
				+" completed");
	}
}
class T_1 implements Runnable{
   private SharedData shareData;
	public T_1(SharedData shareData) {
	super();
	this.shareData = shareData;
}
	@Override
	public void run() {
		try {
			this.shareData.m1();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
class T_2 implements Runnable{
	   private SharedData shareData;
		public T_2(SharedData shareData) {
		super();
		this.shareData = shareData;
	}
		@Override
		public void run() {
			try {
				this.shareData.m1();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
public class Test12 {

	public static void main(String[] args) throws InterruptedException {
		SharedData sharedData = new SharedData();
		//SharedData sharedData2 = new SharedData();
		Thread th = new Thread(new T_1(sharedData));
		Thread th2 = new Thread(new T_2(sharedData));
		
		th.setName("Thread-A");
		th2.setName("Thread-B");
		
		th.start();
		th.join();
		th2.start();
		th2.join();
	}

}
