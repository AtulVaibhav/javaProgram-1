package com.inheritance;

class Employee{
	public String getCompanyName(){
		return "ABC Pvt Ltd";
	}
}
class FullTimeEmployee extends Employee{
	public int getSalary(){
		return 45000;
	}
}
class PartTimeEmployee extends Employee{
	public int getSalary(){
		return 23000;
	}
}
public class HierarchicalInheritance {

	public static void main(String[] args) {
	FullTimeEmployee fullTimeEmployee = new FullTimeEmployee();
	System.out.println(fullTimeEmployee.getCompanyName());
	System.out.println(fullTimeEmployee.getSalary());
	
	System.out.println("___________________________________");
	
	PartTimeEmployee partTimeEmployee = new PartTimeEmployee();
	System.out.println(partTimeEmployee.getCompanyName());
	System.out.println(partTimeEmployee.getSalary());
	
	
	

	}

}
