package com.list;

import java.util.Stack;

public class Test4 {

	public static void main(String[] args) {
		Stack<Integer> stack =new Stack<>();
		
		for(int i=10;i<=50;i=i+10) {
			stack.push(i);
		}
     System.out.println(stack);
     
     System.out.println(stack.pop());
   
	}

}
