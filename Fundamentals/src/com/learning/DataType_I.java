package com.learning;

public class DataType_I {

	public static void main(String[] args) {
		System.out.println("byte size :"+Byte.SIZE+" bits");
        System.out.println("short size :"+Short.SIZE+" bits");
        System.out.println("int size :"+Integer.SIZE+" bits");
        System.out.println("long size :"+Long.SIZE+" bits");
        System.out.println("float size :"+Float.SIZE+" bits");
        System.out.println("double size :"+Double.SIZE+" bits");
        System.out.println("char size :"+Character.SIZE+" bits");
        
        System.out.println("___________________________________");
        System.out.println("Printing range for datatypes");
        System.out.println("byte range :"+Byte.MIN_VALUE+" -> "+Byte.MAX_VALUE);
        System.out.println("short range :"+Short.MIN_VALUE+" -> "+Short.MAX_VALUE);
        System.out.println("int range :"+Integer.MIN_VALUE+" -> "+Integer.MAX_VALUE);        
        System.out.println("long range :"+Long.MIN_VALUE+" -> "+Integer.MAX_VALUE);
        System.out.println("float range :"+Float.MIN_VALUE+" -> "+Float.MAX_VALUE);
        System.out.println("double range :"+Double.MIN_VALUE+" -> "+Double.MAX_VALUE);
	}

}
