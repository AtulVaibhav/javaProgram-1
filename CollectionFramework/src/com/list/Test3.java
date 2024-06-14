package com.list;

import java.util.Vector;

public class Test3 {

	public static void main(String[] args) {
		Vector<Integer> vector = new Vector<>();
		System.out.println(vector.capacity());
		System.out.println(vector.size());
		System.out.println(vector.isEmpty());
		
		//add elements:
		for(int i=11;i<=15;i++) {
			vector.add(i);
		}
        
		//readAll
		for(Integer vectorData:vector) {
			System.out.println(vectorData);
		}
		
		System.out.println(vector.get(0));
		
		
		//update
		System.out.println(vector);
		vector.set(1,21);
		System.out.println(vector);
		
		
		//delete
		vector.remove(1);
		System.out.println(vector);
		
		
		
	}

}
