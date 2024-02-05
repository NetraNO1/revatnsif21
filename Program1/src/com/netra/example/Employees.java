package com.netra.example;

public class Employees {

	private String employeeName;

	public Employees(String employeeName) {
	
		this.employeeName = employeeName;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	@Override
	public String toString() {
		return ("employeeName " + employeeName);
	}
	
	
}
