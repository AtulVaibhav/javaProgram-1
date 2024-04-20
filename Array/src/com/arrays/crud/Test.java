package com.arrays.crud;

import java.util.Arrays;

class Array{
	private int[] arr;
	public Array(int size){
		this.arr = new int[size];
		for(int i=0;i<size;i++){
			arr[i] = Integer.MAX_VALUE;
		}
	}
	
	public void getArray(){
		//using for loop
//		for(int i=0;i<arr.length;i++){
//			System.out.print(arr[i]+" ");
//		}
//		System.out.println();
//		
//		System.out.println("___________________________");
//		
//		//using enhanced forLoop
//		for(int data:arr){
//			System.out.print(data+" ");
//		}
//		System.out.println();
//		System.out.println("___________________________");
		
		//using Arrays
		System.out.println(Arrays.toString(arr));
	}
	
	public void insertElement(int position,int newElement){
		if(position<arr.length && position>=0){
			if(arr[position]==Integer.MAX_VALUE){
				arr[position] = newElement;
				System.out.println("Element added successfully at position :"+position);
			}else{
				System.out.println("Element already exists.Can't insert new element");
			}
		}else{
			System.out.println("Position should be less than length and greater than equals to 0");
		}
	}
	
	public void getElementByPosition(int position){
		if(position<arr.length && position>=0){
			if(arr[position]!=Integer.MAX_VALUE){
				System.out.println("Element at given position :"+arr[position]);
			}else{
				System.out.println("No element found at given position");
			}
		}else{
			System.out.println("Position should be less than length and greater than equals to 0");
		}
	}
	
	public void updateElement(int position,int updatedValue){
		if(position<arr.length && position>=0){
			if(arr[position]!=Integer.MAX_VALUE){
				arr[position] = updatedValue;
				System.out.println("array updated successfully");
			}else{
				System.out.println("No element found to update");
			}
		}else{
			System.out.println("Invalid index");
			
		}
	}
	
	public void deleteElement(int position){
		if(position<arr.length && position>=0){
			if(arr[position]!=Integer.MAX_VALUE){
				arr[position]= Integer.MAX_VALUE;
				System.out.println("Element deleted successfully");
			}else{
				System.out.println("No element found to delete");
			}
		}else{
			System.out.println("Invalid index");
		}
	}
}


public class Test {

	public static void main(String[] args) {
		Array arr = new Array(5);
		//arr.getArray();
		arr.insertElement(1, 100);
         arr.getArray();
         arr.getElementByPosition(2);
         arr.updateElement(1, 500);
         arr.getArray();
         arr.updateElement(2, 500);
         arr.deleteElement(1);
         arr.getArray();
	}

}
