package com.map;

import java.util.LinkedHashMap;
import java.util.Map;

public class Problem_II {
    public static void getCount(int[] arr) {
    	Map<Integer,Integer> map = new LinkedHashMap<>();
    	for(int key : arr) {
    		if(map.containsKey(key)) {
    			map.put(key, map.get(key)+1);
    		}else {
    			map.put(key,map.getOrDefault(key, 1));
    		}
    	}
    	System.out.println(map);
    }
	public static void main(String[] args) {
		int[] arr= {1,5,3,1,2,6,2,6,5,5,1};
		getCount(arr);
	}

}
