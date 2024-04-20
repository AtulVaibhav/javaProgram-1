package com.stringBuffer;

public class Test2 {

	public static void main(String[] args) {
		//StringBuffer methods:
		
		//1.append();
		StringBuffer sb = new StringBuffer("Java");
		sb.append("World");
		System.out.println(sb);
		
		//2.insert
		sb.insert(1, "Hello");
		System.out.println(sb);
		
		//replace
		sb.replace(1,4, "Python");
		System.out.println(sb);
		
		
		//delete
		sb.delete(1, 3);
		System.out.println(sb);
		
		
		//length()
		System.out.println(sb.length());
		
		//charAt()
		System.out.println(sb.charAt(1));
		
		//substring
		System.out.println(sb.substring(0,3));
		
		//reverse()
		StringBuffer sb2 = new StringBuffer("Hello");
		sb2.reverse();
		System.out.println(sb2);
		
		//indexOf
		System.out.println(sb2.indexOf("l"));
		
		//lastIndexOf
		System.out.println(sb2.lastIndexOf("l"));
		
		

	}

}
