package com.learning;

class Code{
	static{
		System.out.println("static block executed");
	}
	
	{
		System.out.println("object created");
	}
}
public class Block {

	public static void main(String[] args) {
		Code c1 = new Code();
		Code c2 = new Code();
		

	}

}
