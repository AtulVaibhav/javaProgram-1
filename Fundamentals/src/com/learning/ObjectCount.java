package com.learning;

class Data{
	static int count = 0;
	Data(){
		count++;
	}
}
public class ObjectCount {

	public static void main(String[] args) {
		Data d1 = new Data();
		Data d2 = new Data();
		Data d3 = new Data();
		Data d4 = new Data();
		System.out.println(Data.count);

	}

}
