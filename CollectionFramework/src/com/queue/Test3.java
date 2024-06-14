package com.queue;

import java.util.ArrayDeque;

public class Test3 {

	public static void main(String[] args) {
		ArrayDeque<Integer> deque = new ArrayDeque<>();
		deque.add(10);
		deque.add(5);
		
		System.out.println(deque);
		
		deque.addFirst(1);
		System.out.println(deque);
		
		deque.addLast(20);
		System.out.println(deque);
		
		
		//read
		System.out.println(deque.peek());
		System.out.println(deque.peekFirst());
		System.out.println(deque.peekLast());
		System.out.println(deque.element());
		
		//remove
		System.out.println(deque.poll());
		System.out.println(deque.pollFirst());
		System.out.println(deque.pollLast());
		
		System.out.println(deque.isEmpty());
		System.out.println(deque.contains(20));
		

	}

}
