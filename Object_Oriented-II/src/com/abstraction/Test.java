package com.abstraction;

interface DoSomething{
	 void eat();
	 void study();
	
	public default void wakeUp(){
		System.out.println("WakeUp early");
	}
	
	public static void doExercise(){
		System.out.println("Work-out daily");
	}
}
 class Routine implements DoSomething{
	public void eat(){
		System.out.println("Eat healthy");
	}
	public void study(){
		System.out.println("Study well");
	}
}

public class Test {

	public static void main(String[] args) {
		//DoSomething obj = new DoSomething();
        Routine routine = new Routine();
        routine.eat();
        routine.study();
        routine.wakeUp();
        DoSomething.doExercise();
	}

}
