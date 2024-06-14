package com.queue;

import java.util.PriorityQueue;

public class Test2 {

	public static void main(String[] args) {
		int[] arr = {4,1,8,3,5,10,7};
		int k = 3;
		int count=1;
		PriorityQueue<Integer> queue = new PriorityQueue<>();
		for(int i:arr) {
			queue.add(i);
		}
		while(count<k) {
			queue.poll();
			count++;
		}
		System.out.println(queue.element());
			

	}

}
