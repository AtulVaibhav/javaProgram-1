package com.list;

import java.util.ArrayList;
import java.util.Iterator;

public class FailFastIteratorTest {

	public static void main(String[] args) {
		ArrayList<Integer> arrayList = new ArrayList<>();
		arrayList.add(12);
		arrayList.add(15);
		
		Iterator<Integer> itr = arrayList.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
			arrayList.add(20);
		}

	}

}
