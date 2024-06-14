package com.map;

import java.util.LinkedHashMap;
import java.util.Map;

public class Problem_III {
   public static void repeatedCharacter(String str) {
	   Map<Character,Integer> map =new LinkedHashMap<>();
	   for(int i=0;i<str.length();i++) {
		   if(map.containsKey(str.charAt(i))) {
			   map.put(str.charAt(i), map.get(str.charAt(i))+1);
		   }else {
			   map.put(str.charAt(i), map.getOrDefault(str.charAt(i), 1));
		   }
	   }
	   
	   for(Map.Entry<Character,Integer> entrySet:map.entrySet()) {
		  if(entrySet.getValue()>1) {
			  System.out.println(entrySet.getKey());
		  }
	   }
   }
	public static void main(String[] args) {
		String str = "Java";
		repeatedCharacter(str);

	}

}
