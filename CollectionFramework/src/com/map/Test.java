package com.map;

import java.util.HashMap;
import java.util.Map;

public class Test {

	public static void main(String[] args) {
		Map<String,Integer> map = new HashMap<>();
		map.put("John", 25);
		map.put("Vivek", 27);
		map.put("Adam", 21);
		map.put("Varun", 30);
		
		System.out.println(map);
		
		
		//to access value ,we need to use key
		System.out.println(map.get("Adam"));
		
	    //key can't be duplicated
		map.put("Adam", 34);
		System.out.println(map);
		
		//values can be duplicated
		map.put("Doe", 27);
		System.out.println(map);
		
		//null as key is possible
//		map.put(null, 12);
//		System.out.println(map);
		
		
		//null as value is possible
		map.put("Yuan", null);
		System.out.println(map);
		
		
		
		//traversal
		
		for(Map.Entry<String,Integer> entrySet : map.entrySet()){
			//System.out.println(entrySet.getKey());
			//System.out.println(entrySet.getValue());
//			if(entrySet.getKey().startsWith("Vi")) {
//				System.out.println(entrySet.getValue());
//			}
		}
		
		if(map.containsKey("John")) {
			System.out.println(map.get("John"));
		}
		
		

	}

}
