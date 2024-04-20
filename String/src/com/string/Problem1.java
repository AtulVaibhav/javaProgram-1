package com.string;

import java.util.Arrays;

public class Problem1 {
     public static void reverserWord(String str){
    	 String newStr="";
    	 String[] str1 = str.split(" ");
    	 for(int i=0;i<str1.length;i++){
    		 newStr +=" "+reverse(str1[i]);
    	 }
    	 
    	 System.out.print(newStr);
     }
	private static String reverse(String string) {
		String rev="";
		for(int i=string.length()-1;i>=0;i--){
			rev = rev+string.charAt(i);
		}
		return rev;
	}
	
	public static void firstNonRepeating(String str){
		for(int i=0;i<str.length();i++){
			if(str.indexOf(str.charAt(i))==str.lastIndexOf(str.charAt(i))){
				System.out.println(str.charAt(i));
			    break;
			}
		}
	}
	
	
	
	public static void main(String[] args) {
		String str = "Java is a programming langauge";
      //  reverserWord(str);
        firstNonRepeating("encyclopedia");
	}

}
