package com.dxc.SpringMavenProj;

public class EmployeeData {
	
	private int empID;
	private String empName;
	
	@Override
	public String toString() {
		return "EmployeeData [empID=" + empID + ", empName=" + empName + "]";
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
