package com.constructorInjection_II;

public class Employee {
	private int empId;
	private String empName;
	private Address addr;
	public Employee(int empId, String empName, Address addr) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.addr = addr;
	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", addr=" + addr + "]";
	}

	

}
