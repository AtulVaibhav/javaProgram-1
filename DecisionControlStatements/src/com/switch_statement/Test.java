package com.switch_statement;

import java.util.Scanner;

class Calculator{
	public static int add(int a,int b){
		return a+b;
	}
	
	public static int sub(int a,int b){
		return a-b;
	}
	
	public static int div(int a,int b){
		if(b==0) return -1;
		return a/b;
	}
	
	public static int mult(int a,int b){
		return a*b;
	}
	public static int mod(int a,int b){
		return a%b;
	}	
}
public class Test {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Select the option to perform calculation");
       
	    System.out.println("1.add   2.sub   3.div   4.mul    5.mod");
		int option = sc.nextInt();
		switch(option){
		case 1:System.out.println(Calculator.add(23, 12));
		       break;
		case 2:System.out.println(Calculator.sub(13, 11));
		       break;
		case 3:System.out.println(Calculator.div(12, 0));
		       break;
		case 4:System.out.println(Calculator.mult(12, 13));
		       break;
		case 5:System.out.println(Calculator.mod(10, 4));
		       break;
		default:System.out.println("Invalid option");
		
		}
		System.out.println("Out of switch-statement");
        
        
        
        
	}

}
