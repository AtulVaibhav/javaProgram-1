package com.string;

import java.util.Arrays;

public class Test4 {

	public static void main(String[] args) {
		//String methods:
		//1.length();
       String str = "Java";
       System.out.println(str.length());
       
       //2.charAt(index)
       System.out.println(str.charAt(0));
       
       //3.indexOf(char):first occurrence
       String str2 = "Hello";
       System.out.println(str2.indexOf('l'));
      
       //4.lastIndexOf(char):last occurrence
       System.out.println(str2.lastIndexOf('l'));
       
       //5.==,equals()
       String str1 ="Hello";
       String str3 = "hello";
       System.out.println(str1==str3);
       System.out.println(str1.equals(str3));
       
       //6.toCharArray()
       char[] ch = str3.toCharArray();
       System.out.println(Arrays.toString(ch));
       
       //7.Split:String[]
       String s = "Java World";
       String[] arr = s.split(" ");
       System.out.println(Arrays.toString(arr));
       
       
       //8.substring
       String s1 = "Java";
       System.out.println(s1.substring(1,3));
       
      //9.contains
       System.out.println(s1.contains("av"));
       
       //10.upper-lower
       System.out.println(s1.toUpperCase()+" "+s1.toLowerCase());
       
	}

}
