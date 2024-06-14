package com.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Test1 {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		
		//get size():
		System.out.println(list.size());
		//adding objects to arrayList
		list.add(1);
		list.add(10);
		list.add(5);
		list.add(20);
		list.add(10);
		//list.add(null);
		
		
		
		System.out.println(list.size());
		//reading list:
		System.out.println(list);
		//read value based on index: get(i)
		System.out.println("Reading object based on indexing");
        System.out.println(list.get(2));
        //to iterate over the list: enhanced for-loop
        for(Integer obj  :list) {
        	System.out.println(obj);
        }
        
        Iterator<Integer> itr = list.iterator();
        while(itr.hasNext()) {
        	System.out.println(itr.next());
        }
        
       System.out.println("_______________________________");
       
        //update operation:
         System.out.println(list); 
        list.set(0,100);
        System.out.println(list);
        
        
        //remove
        list.remove(1);
        System.out.println(list);
        
        //search
        System.out.println(list.contains(10));
        
        
        //sorting
        Collections.sort(list);
        System.out.println(list);
        
        Collections.reverse(list);
        System.out.println(list);
        
	}

}
