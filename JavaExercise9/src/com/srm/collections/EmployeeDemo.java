package com.srm.collections;

import java.util.LinkedList;

class Emp
{
	LinkedList<Employee> l=new LinkedList<Employee>();
	void addData()
	{
		Employee e1=new Employee("A2930","Diya","Developer");
		Employee e2=new Employee("A2931","Shanmuga Priya","Trainee");
		Employee e3=new Employee("A2932","Riya","Technical Manager");
		Employee e4=new Employee("A2933","Kaviya","Accounts Manager");
		Employee e5=new Employee("A2934","Deepika","Senior Programmer");
		Employee e6=new Employee("A2935","Venba","Junior Programmer");
		Employee e7=new Employee("A2936","Kavitha","Junior HR");
		Employee e8=new Employee("A2937","Diya","Senior HR");
		Employee e9=new Employee("A2938","Kavitha","Head of HR");
		Employee e10=new Employee("A2939","Banumathi","Developer");
		l.add(e1);
		l.add(e2);
		l.add(e3);
		l.add(e4);
		l.add(e5);
		l.add(e6);
		l.add(e7);
		l.add(e8);
		l.add(e9);
		l.add(e10);
	}
	void retrieveData(int key)
	{
		System.out.println("ArrayList Elements : ");
		l.forEach(System.out::println);
		System.out.println("=====================================================");
		System.out.println("Searched Data ");
		System.out.println(l.get(key));
	}
}
public class EmployeeDemo {

	public static void main(String[] args) {
		Emp e=new Emp();
		e.addData();
		
		e.retrieveData(9);
	}

}
