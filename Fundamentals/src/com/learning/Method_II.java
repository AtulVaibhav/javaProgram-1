package com.learning;

public class Method_II {
    public int m1(){
    	return 10;
    }
    public String m2(){
    	return "Hello";
    }
    public void m3(){
    	System.out.println("Hello");
    	return ;
    }
	public static void main(String[] args) {
		System.out.println("Main() started");
		Method_II obj = new Method_II();
		//obj.m1();//10
       System.out.println(obj.m1());
       
       int result = obj.m1();
       System.out.println(result);
       
       String result2 = obj.m2();
       System.out.println(result2.concat("World"));
	}

}
