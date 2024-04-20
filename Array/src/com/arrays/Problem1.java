package com.arrays;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class Problem1 {
    public static int sumOfElements(int[] arr){
    	int sum = 0;
    	for(int data:arr){
    		sum +=data;
    	}
    	return sum;
    }
    
    public static int findLargestElement(int[] arr){
    	int currentElement =arr[0];
    	for(int data:arr){
    		if(currentElement<data){
    			currentElement = data;
    		}
    	}
    	return currentElement;
    }
    
    public static int getIndexPosition(int[] arr,int key){
    	for(int i=0;i<arr.length;i++){
    		if(arr[i]==key){
    			return i;
    		}
    	}
    	return -1;
    }
    public static void getPairs(int[] arr,int sum){
    	for(int i=0;i<arr.length-1;i++){
    		for(int j=i+1;j<arr.length;j++){
    			if(arr[i]+arr[j]==sum){
    				System.out.println(arr[i]+","+arr[j]);
    			}
    		}
    	}
    }
    
    public static void sortInAscendingOrder(int[] arr){
    	for(int i=0;i<arr.length-1;i++){
    		for(int j=i+1;j<arr.length;j++){
    			if(arr[i]>arr[j]){
    				int temp = arr[i];
    				arr[i] = arr[j];
    				arr[j] = temp;
    			}
    		}
    	}
    	System.out.println(Arrays.toString(arr));
    }
    
    public static void findOccurrence(int[] arr,int key){
    	int count=0;
    	for(int i=0;i<arr.length;i++){
    		if(arr[i]==key){
    			count++;
    		}
    	}
    	if(count>0){
    		System.out.println("Total Count :"+count);
    	}else{
    		System.out.println("Element not found");
    	}
    }
    
    public static void reverse(int[] arr){
    	for(int i=arr.length-1;i>=0;i--){
    		System.out.print(arr[i]+" ");
    	}
    	System.out.println();
    }
    
    public static void rotateByKTimes(int [] arr,int k){
    	int temp =arr[arr.length-1];
    	for(int i=arr.length-1;i>=1;i--){
    		arr[i]=arr[i-1];
    	}
    	arr[0]=temp;
    	System.out.println(Arrays.toString(arr));
    }
	public static void main(String[] args) {
		int[] arr = {11,12,16,13,20,9};
        System.out.println(sumOfElements(arr));
       
      int[] arr2 = {4,1,2,5,9,8,7,3};
      System.out.println(findLargestElement(arr2));
        
       int[] arr3 = {5,7,10,9,6};
       int key = 110;
       int pos = getIndexPosition(arr3, key);
       if(pos>=0){
    	   System.out.println("Key element found at position :"+pos);
       }else{
    	   System.out.println("Key not found");
       }
       
       int[] arr4 = {5,7,3,9,1,2};
        int givenSum = 10;
        getPairs(arr4, givenSum);
        
        System.out.println("_______________________");
        int[] arr5 = {2,1,5,3,4};
        sortInAscendingOrder(arr5);
        
        System.out.println("______________________");
        int[] arr6={1,2,2,2,1,1,1,4,3,1};
        findOccurrence(arr6, 11);
        
        System.out.println("____________________________");
        int[] arr7 = {1,12,10,8,7};
        reverse(arr7);
        
        System.out.println("________________________________");
        int[] arr8 = {21,31,41,51,61};
        rotateByKTimes(arr8, 1);
	}

}
