package com.constructorInjection_III;

import java.util.List;

public class Employee {
	private int empId;
	private String empName;

	private List<String> projects;

	public Employee(int empId, String empName, List<String> projects) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.projects = projects;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", projects=" + projects + "]";
	}
	
	
}
