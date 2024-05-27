package com.generics;

import java.util.ArrayList;

//Problem without Generics

public class Test {

	public static void main(String[] args) {
		ArrayList<Integer> list =  new ArrayList<>();
		list.add(10);
		list.add(20);
		//list.add("hello");
		
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i));
		}

	}

}
