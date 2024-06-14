package com.map;

import java.util.ArrayList;
import java.util.List;

public class Problem {
    public static void getCount(int[] arr) {
    	List<Integer>list = new ArrayList<>();
    	for(int i=0;i<arr.length;i++) {
    		int count=0;
    		int element = arr[i];
    		if(!list.contains(element)) {
    			for(int j=i;j<arr.length;j++) {
    				if(arr[j]==element) {
    					count++;
    				}
    				list.add(element);
    				}
    			System.out.println(element+" occurred "+count+"times");
    			
    		}
    	}
    }
	public static void main(String[] args) {
		int[] arr= {1,5,3,1,2,6,2,6,5,5,1};
		getCount(arr);

	}

}
