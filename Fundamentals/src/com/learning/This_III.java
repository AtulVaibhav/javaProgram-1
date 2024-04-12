package com.learning;
//use of this keyword inside a method

class Dept{
	String deptName = "CS Dept";
	String collegeName = "ABC College Of Engineering";
	
	public void getCollegeName(){
	   System.out.println("College Name :"+this.collegeName);	
	    this.collegeFee();
	}
	public void getDeptName(){
		System.out.println("Dept Name :"+this.deptName);
	}
	
	private void collegeFee(){
		System.out.println("27000/year");
	}
}

public class This_III {

	public static void main(String[] args) {
		Dept dept = new Dept();
		dept.getCollegeName();
		dept.getDeptName();
		//dept.collegeFee();
	}

}
