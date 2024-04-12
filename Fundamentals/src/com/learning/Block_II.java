package com.learning;

public class Block_II {
    static{
    	System.out.println("static block executed");
    }
    Block_II(){
    	System.out.println("Constructor called");
    }
    {
    	System.out.println("IIB block executed");
    }
	public static void main(String[] args) {
		Block_II b = new Block_II();
	}

}
