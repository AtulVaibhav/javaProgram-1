package com.string;

public class Test1 {

	public static void main(String[] args) {
		String str = "Hello";
		System.out.println(str);
		System.out.println(str.hashCode());
        str.concat("World");
        System.out.println(str);
		System.out.println(str.hashCode());
		
		//System.out.println(str.concat("World").hashCode());
		System.out.println(str.hashCode());
		
		str = str.concat("Java");
		System.out.println(str.hashCode());
	}

}
