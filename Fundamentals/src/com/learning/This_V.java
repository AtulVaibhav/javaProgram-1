package com.learning;

public class This_V {
    int a = 10;
    public void m1(){
    	int a = 20;
    	System.out.println(a);
    	System.out.println(this.a);
    }
	public static void main(String[] args) {
		new This_V().m1();
	}

}
