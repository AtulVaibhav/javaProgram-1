package com.exception;

public class UncheckedException {
    public static void m1(){
    	//System.out.println(12/0);//java.lang.ArithmeticException
       
    	
    	String str=null;
    	//System.out.println(str.length());//java.lang.NullPointerException
    
    	
    	String str1 = "123xyx";
    	//System.out.println(Integer.parseInt(str1));//java.lang.NumberFormatException
    
        int[] arr={1,2,3};
        System.out.println(arr[4]);// java.lang.ArrayIndexOutOfBoundsException    
    }
	public static void main(String[] args) {
		m1();

	}

}
