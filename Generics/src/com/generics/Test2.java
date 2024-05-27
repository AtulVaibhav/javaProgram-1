package com.generics;

class GenericClass<T>{
	private T content;
	public GenericClass(T content) {
		this.content = content;
	}
	
	public T getContent() {
		return this.content;
	}
}

public class Test2 {

	public static void main(String[] args) {
		GenericClass<Integer> intObj = new GenericClass<>(120);
		System.out.println(intObj.getContent());
        
		
		GenericClass<String> strObj = new GenericClass<>("Hello,Generic");
		System.out.println(strObj.getContent());
		
	}

}
