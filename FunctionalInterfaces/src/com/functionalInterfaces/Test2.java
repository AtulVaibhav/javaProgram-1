package com.functionalInterfaces;

import java.util.Arrays;

@FunctionalInterface
interface Account{
	//int amountCredited();
	
	int[] sortArray(int[] ar);
}
public class Test2 {

	public static void main(String[] args) {
//		Account a1 = ()->{return 30000;};
//		System.out.println(a1.amountCredited());
		int[] arr= {4,1,5,2,3,7,6};
		Account a2 = (ar)->{
			Arrays.sort(ar);
			return ar;
		};
		System.out.println(Arrays.toString(a2.sortArray(arr)));
       
	}

}
