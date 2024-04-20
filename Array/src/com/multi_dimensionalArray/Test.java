package com.multi_dimensionalArray;

public class Test {

	public static void main(String[] args) {
		//creating 2d array:
		int[][] arr = {{1,2,3},{11},{21,22}};
		int[][] arr2 = new int[5][4];
		
		
		//traversal:
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr[i].length;j++){
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}

	}

}
