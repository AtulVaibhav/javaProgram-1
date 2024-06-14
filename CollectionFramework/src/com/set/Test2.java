package com.set;

import java.util.LinkedHashSet;
import java.util.Set;

public class Test2 {

	public static void main(String[] args) {
		Set<Integer> set = new LinkedHashSet<>();
		set.add(87);
		set.add(12);
		set.add(45);
		set.add(45);
		set.add(null);
		
		System.out.println(set);

	}

}
