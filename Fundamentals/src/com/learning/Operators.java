package com.learning;

public class Operators {
    public static void arithmeticOperator(){
    	int a =10;
    	int b=6;
    	System.out.println(a+b);
    	System.out.println(a-b);
    	System.out.println(a*b);
    	System.out.println(a/b);
    	System.out.println(a%b);
    }
    
    public static void relationalOperator(){
    	int x = 10;
    	int y = 20;
    	System.out.println(x>y);
    	System.out.println(x>=y);
    	System.out.println(x<y);
    	System.out.println(x<=y);
    	System.out.println(x==y);
    	System.out.println(x!=y);	
    }
    
    public static void logicalOperator(){
    	int x = 20;
    	int y=50;
    	boolean result = ((x<y) && (x!=y));
    	System.out.println(result);
    	
    	boolean result2 = !((x>y)&&(x!=y)||(x<y));
    	System.out.println(result2);
    }
    
    public static void shiftOperator(){
    	int a =25;
    	System.out.println(a<<3);
    	int b=100;
    	System.out.println(b>>2);
    }
    
    public static void bitwiseOperator(){
    	int a = 10;
    	int b = 8;
    	System.out.println(a&b);
    	System.out.println(a|b);
    	System.out.println(a^b);
    }
    
    public static void assignmentOperator(){
    	int a=10;
    	int b=20;
    	a = b;
    	System.out.println(a+" "+b);
    	a *=20;// a = a*20= 20*20
    	System.out.println(a);
    	
    	b %=2;
    	System.out.println(b);
    }
    
    public static void ternaryOperator(){
    	int x=12;
    	int y = 20;
    	String str = x>y?"Hello":"Hi";
    	System.out.println(str);
    	
    	String str2 = x>y?(x==y?"Hello":"Hi"):"Bye";
    	System.out.println(str2);
    	
     	String str3 = x<y?(x==y?"Hello":"Hi"):"Bye";
    	System.out.println(str3);
    }
    
    
    public static void unaryOperator(){
    	int a=10;
    	int b = a++;
    	System.out.println(a+" "+b);
    	
    	int c=12;
    	int d = ++c;
    	System.out.println(c+" "+d);
    }
    
    public static void instanceOfOperator(){
    	String str = "Hi";
    	boolean result = str instanceof Object;
    	System.out.println(result);
    	
        Integer a = new Integer(10);
    	boolean result2 = a instanceof Integer;
    }
	public static void main(String[] args) {
		arithmeticOperator();
        relationalOperator();
        logicalOperator();
        shiftOperator();
        bitwiseOperator();
        assignmentOperator();
        ternaryOperator();
        unaryOperator();
        instanceOfOperator();
	}

}
