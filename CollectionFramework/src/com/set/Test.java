package com.set;

import java.util.HashSet;
import java.util.Set;

public class Test {

	public static void main(String[] args) {
		Set<Integer>  set = new HashSet<>();
		set.add(27);
		set.add(38);
		set.add(12);
		set.add(12);
		set.add(null);
		
		System.out.println(set);
		
	
	
	}

}
