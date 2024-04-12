package com.learning;

class Box3{
	Box3(){
		System.out.println("Current value of this---->"+this);
	}

}

public class This_I {

	public static void main(String[] args) {
		Box3 b1 = new Box3();
        System.out.println("Current value of b1---->"+b1);
        
        
        Box3 b2 = new Box3();
        System.out.println("Current value of b1---->"+b2);
        
	}

}
