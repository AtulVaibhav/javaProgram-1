package com.if_else;

public class Test7 {
    public void getDivision(int marks){
    	if(marks>=80){
    		System.out.println("Distinction");
    	}else if(marks>=60 && marks<80){
    		System.out.println("First Division");
    	}else if(marks>=40 && marks<60){
    		System.out.println("Second Division");
    	}else{
    		System.out.println("Try next year");
    	}
    }
	public static void main(String[] args) {
		Test7 obj = new Test7();
		obj.getDivision(45);

	}

}
