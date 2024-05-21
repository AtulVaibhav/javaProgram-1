package com.association;

public class Employee {
    private int empId;
    private String empName;
    private Address address;
	public Employee(int empId, String empName, Address address) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.address = address;
	}
    
    public void empDetails(){
    	System.out.println("EmpId :"+this.empId);
    	System.out.println("EmpName:"+this.empName);
    	System.out.println("EmpAddress:"+this.address);
    }
}
