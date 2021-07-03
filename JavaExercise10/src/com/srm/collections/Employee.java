package com.srm.collections;

public class Employee {
String eno,ename,designation;
Employee(String eno,String ename,String designation)
{
	this.ename=ename;
	this.eno=eno;
	this.designation=designation;
}
@Override
public String toString() {
	return "Employee [eno=" + eno + ", ename=" + ename + ", designation=" + designation + "]";
}
}
