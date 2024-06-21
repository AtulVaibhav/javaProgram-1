package com.list;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class FailSafeIteratorTest {

	public static void main(String[] args) {
		CopyOnWriteArrayList<Integer> copyOnWriteArrayList = 
				new CopyOnWriteArrayList<>();
		copyOnWriteArrayList.add(12);
		copyOnWriteArrayList.add(15);
		
		Iterator<Integer> itr = copyOnWriteArrayList.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
			copyOnWriteArrayList.add(20);
		}
		
		System.out.println(copyOnWriteArrayList);

	}

}
