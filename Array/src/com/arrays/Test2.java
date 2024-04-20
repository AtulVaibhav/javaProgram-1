package com.arrays;

public class Test2 {

	public static void main(String[] args) {
		int[] arr = {21,23,2,4,25};
		
		//traverse
		for(int data:arr){
			System.out.print(data+" ");
		}
		System.out.println();
		
		//getElement based on index
		System.out.println(arr[2]);
		
		
		//update
		arr[3] = 1000;
		System.out.println("After update :");
		for(int data:arr){
			System.out.print(data+" ");
		}
		System.out.println();
		
		
		
		

	}

}
