package com.try_finally_I;

public class FinallyBlock {
    public static void m1(){
    	try{
    		int result=12/0;
    	}finally{
    		System.out.println("finally block executed");
    	}
    }
	public static void main(String[] args) {
		m1();

	}

}
