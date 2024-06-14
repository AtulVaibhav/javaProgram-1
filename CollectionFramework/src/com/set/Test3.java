package com.set;

import java.util.TreeSet;

public class Test3 {

	public static void main(String[] args) {
		TreeSet<Integer> treeSet  = new TreeSet<>();
		treeSet.add(100);
		treeSet.add(56);
		treeSet.add(200);
		treeSet.add(200);
		//treeSet.add(null);
		System.out.println(treeSet);

	}

}
