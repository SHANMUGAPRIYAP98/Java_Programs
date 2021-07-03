package com.srm.collections;

public class Employee {
	String eno,ename,designation;
	Employee(String eno,String ename,String designation)
	{
		this.eno=eno;
		this.ename=ename;
		this.designation=designation;
	}
	@Override
	public String toString() {
		return "Employee [eno=" + eno + ", ename=" + ename + ", designation=" + designation + "]";
	}
	
}
