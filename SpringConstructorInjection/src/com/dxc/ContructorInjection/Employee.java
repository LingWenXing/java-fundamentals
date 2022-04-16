package com.dxc.ContructorInjection;

public class Employee {
	int empID;
	String empName;
	
	public Employee(int empID, String empName) {
		super();
		this.empID = empID;
		this.empName = empName;
	}
	
	@Override
	public String toString() {
		return empID + " " + empName;
	}
	public int getEmpID() {
		return empID;
	}
	public void setEmpID(int empID) {
		this.empID = empID;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	
	
}
