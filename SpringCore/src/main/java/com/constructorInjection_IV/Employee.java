package com.constructorInjection_IV;

import java.util.Set;

public class Employee {
	private int empId;
	private String empName;
	private Set<Address> addr;
	public Employee(int empId, String empName, Set<Address> addr) {
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
