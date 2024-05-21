package com.polymorphism;

class AreaCalculation{
	public static void area(int radius){
		System.out.println("Area of circle :"+Math.PI*radius*radius);
	}
	
	public static void area(int length,int breadth){
		System.out.println("Area of rectangle :"+(length*breadth));
	}
	
	public static void area(float side){
		System.out.println("Area of square :"+(side*side));
	}
}

public class MethodOverloading {
    public static void main(Integer[] args){
    	System.out.println("custom main method");
    }
	public static void main(String[] args) {
	    AreaCalculation.area(12.45f);
	    Integer[] ar = {1,2,3,5};
	    main(ar);
	}

}
