package com.learning;
//to differentiate between instance variable and localvariable when
// there is naming confliction

class Emp{
	int empId;
	String empName;
	public Emp(int empId, String empName) {
		this.empId = empId;
		this.empName = empName;
	}

	public void show(){
		System.out.println(this.empId+" "+this.empName);
	}
}


public class This_II {

	public static void main(String[] args) {
		Emp obj = new Emp(101,"Arun");
		obj.show();

	}

}
