package com.learning;

class Box2{
	static int length=30;//static variable
}
public class Variable_II {

	public static void main(String[] args) {
		//using classname:   ClassName.varName
      System.out.println(Box2.length);
        //using object: objName.varName
      Box2 box = new Box2();
      Box2 box2 = new Box2();
      Box2 box3 = new Box2();
      
      System.out.println(box.length);
      
      System.out.println("____________________________");
      System.out.println("before modification:");
      System.out.println(box.length);
      System.out.println(box2.length);
      System.out.println(box3.length);
      
      System.out.println("_________________________");
      System.out.println("after modification");
      box.length=56;
      System.out.println(box.length);
      System.out.println(box2.length);
      System.out.println(box3.length);
      
      
      
      
      
      
	}

}
//The static field Box2.length should be accessed in a static way