package com.queue;

import java.util.Collections;
import java.util.PriorityQueue;

public class Test {

	public static void main(String[] args) {
		PriorityQueue<Integer> priorityQueue = new PriorityQueue<>(3);
	     // add , offer	
		
//		priorityQueue.add(10);
//		priorityQueue.add(5);
//		priorityQueue.add(20);
//		priorityQueue.add(1);
//		//priorityQueue.add(null);
//		
//		System.out.println(priorityQueue.element());
		
		priorityQueue.offer(10);
		priorityQueue.offer(5);
		priorityQueue.offer(20);
		priorityQueue.offer(1);
		//priorityQueue.offer(null);
		System.out.println(priorityQueue);
		
		//read: peek
		System.out.println(priorityQueue.peek());
		System.out.println(priorityQueue.element());
		
		//remove
		System.out.println("Deleted element "+priorityQueue.poll());
		System.out.println(priorityQueue);
		System.out.println("Deleted element "+priorityQueue.poll());
		System.out.println("Deleted element "+priorityQueue.poll());
		System.out.println(priorityQueue);
		
		
       PriorityQueue<Integer> queue = 
    		   new PriorityQueue<>(Collections.reverseOrder());
       queue.offer(101);
       queue.offer(50);
       queue.offer(200);
       queue.offer(10);
       
       System.out.println(queue.element());
	}

}
