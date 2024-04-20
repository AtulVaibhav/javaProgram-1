package com.multi_dimensionalArray;

import java.util.Arrays;

public class Problem {
    public static void setZero(int[][] arr){
    	for(int i=0;i<arr.length;i++){
    		for(int j=0;j<arr[i].length;j++){
    			if(arr[i][j]%2==0){
    				arr[i][j] = 0;
    			}
    		}
    	}
    	System.out.println(Arrays.deepToString(arr));
    }
    
    
    public static void reverseRow_wise(int[][]arr){
    	for(int i=0;i<arr.length;i++){
    		arr[i]=reverseArray(arr[i]);
    	}
    	System.out.println(Arrays.deepToString(arr));
    }
    
    public static void reverseColumn_wise(int[][]arr){
    	
    
    
    
    }
	private static int[] reverseArray(int[] ar) {
		for(int i=0;i<=ar.length/2;i++){
			int temp = ar[i];
			ar[i] = ar[ar.length-i-1];
			ar[ar.length-i-1]  = temp;
		}
		return ar;
	}


	public static void main(String[] args) {
		int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};
//        setZero(arr);
//		reverseRow_wise(arr);
		
		reverseColumn_wise(arr);
		
	}

}
