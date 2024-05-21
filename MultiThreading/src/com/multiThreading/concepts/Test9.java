package com.multiThreading.concepts;
class Data{
	public void print(){
		for(int i=1;i<=5;i++){
			System.out.println(Thread.currentThread().getName()
					+"---->"+i);
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
public class Test9 {

	public static void main(String[] args) {
		Data data = new Data();
		Thread t1 = new Thread(){
			public void run(){
				data.print();
			}
		};
		
		Thread t2 = new Thread(){
			public void run(){
				data.print();
			}
		};
		
		t1.setName("A");
		t2.setName("B");
		
		t2.setPriority(7);
		t1.setPriority(3);
		
		t1.start();
		t2.start();
		
		
		
		

	}

}
