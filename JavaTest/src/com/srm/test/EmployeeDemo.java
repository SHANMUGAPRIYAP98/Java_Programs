package com.srm.test;

import java.util.Scanner;

class Employee
{
	int id;
	String name;
	double salary;
	Employee(int id,String name,double salary)
	{
		this.id=id;
		this.name=name;
		this.salary=salary;
	}
	double newSal()
	{
		if(this.salary>=5000)
		{
			this.salary=this.salary+this.salary*0.20;
		}
		else if(this.salary>=10000 && this.salary<=50000)
		{
			this.salary=this.salary+this.salary*0.40;
		}
		else if(this.salary<5000)
		{
			this.salary=this.salary+this.salary*0.5;
		}
		else
		{
			this.salary=this.salary+this.salary*0.60;
		}
		return this.salary;
	}
	void display()
	{
		System.out.println("Id : "+this.id);
		System.out.println("Name : "+this.name);
		System.out.println("Salary : "+this.salary);
	}
}
public class EmployeeDemo {

	public static void main(String[] args) {
		System.out.println("Enter the Id : ");
		Scanner sc=new Scanner(System.in);
		int id=sc.nextInt();
		System.out.println("Enter the Name : ");
		String name=sc.next();
		System.out.println("Enter the Salary : ");
		double sal=sc.nextDouble();
		Employee e1=new Employee(id,name,sal);
		e1.newSal();
		e1.display();

	}

}
