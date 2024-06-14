package com.list;

import java.util.LinkedList;

public class Test2 {
    public static void printLinkedList(LinkedList<Integer> list) {
    	
    	if(list.isEmpty()) {
    		System.out.println("List is empty");
    	}else {
    	System.out.print("head --->");
    	for(Integer data:list) {
    		System.out.print(data+" --->");
    	}
    	System.out.println("null");
    	}
    }
	public static void main(String[] args) {
		LinkedList<Integer> list = new LinkedList<>();
		
		//check list is empty:
		System.out.println("LinkedList is empty :"+list.isEmpty());
		
		//insert operation:
		list.add(10);
		printLinkedList(list);
		
		list.addFirst(5);
		printLinkedList(list);
		
		list.addLast(20);
		printLinkedList(list);
		
		list.add(2,1000);
		printLinkedList(list);
		
		//get node by index
		System.out.println(list.get(2));
		
		//peek(): gives head element
		System.out.println("Peek element :"+list.peek());
		
		//peekFirst():gives head element
		System.out.println("Peek first element :"+list.peekFirst());
		
		//peekLast(): gives last element
		System.out.println("Peek last element :"+list.peekLast());
		
		System.out.println("__________________________________");
		System.out.println("After updation:");
		//update 
		list.set(0,50);
		printLinkedList(list);
		
		list.set(2,10000);
		printLinkedList(list);
		
		list.set(list.size()-1,200);
		printLinkedList(list);
		
		//delete operation
		//poll():  remove node and return
		int removedNode = list.poll();
		System.out.println("Removed node :"+removedNode);
		printLinkedList(list);
		
		list.remove(1);
		printLinkedList(list);
		
//	    list.pollFirst();
//		printLinkedList(list);
		
		
		list.pollLast();
		printLinkedList(list);
		
		
		list.poll();
		printLinkedList(list);
		
		System.out.println(list.poll());
		
		//System.out.println(list.remove(0));
		
		
		

	}

}
