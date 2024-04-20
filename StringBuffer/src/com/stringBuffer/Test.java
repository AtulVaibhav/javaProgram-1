package com.stringBuffer;

public class Test {

	public static void main(String[] args) {
	  StringBuffer sb = new StringBuffer();
//	  System.out.println(sb.capacity());
//       sb.append("abcdefghijklmnopq");
//       System.out.println(sb.capacity());
	  
	  sb.append("Hello");
	  System.out.println(sb);
	  System.out.println(sb.hashCode());
	  
	  sb.append("Java");
	  System.out.println(sb);
	  System.out.println(sb.hashCode());
	  
	  
	  
	  
	}

}
