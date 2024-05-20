package com.try_finally_I;

public class Finally_Return {
    public static int m1(){
    	try{
    		int result = 12/0;
    		return result;
    	}catch(Exception e){
    		return -1;
    	}finally{
    		return 100;
    	}
    }
	public static void main(String[] args) {
		System.out.println(m1());

	}

}
