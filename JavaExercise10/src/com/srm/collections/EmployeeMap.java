package com.srm.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

class MapData
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
	TreeMap<Integer,Employee> tm=new TreeMap<Integer,Employee>();
	
	void storeData()
	{
		tm.put(1, e1);
		tm.put(2, e2);
		tm.put(3, e3);
		tm.put(4, e4);
		tm.put(5, e5);
		tm.put(6, e6);
		tm.put(7, e7);
		tm.put(8, e8);
		tm.put(9, e9);
		tm.put(10, e10);
		System.out.println("Employee Data");
		for(Map.Entry emp:tm.entrySet())
		{
			System.out.println(emp);
		}
	}
	void retrieveData(int key,String val)
	{
		System.out.println("Find By Key ");
		for(Map.Entry<Integer,Employee> emp:tm.entrySet())
		{
			if(emp.getKey().equals(key))
			{
				System.out.println(emp.getValue());
			}
			System.out.println("Find By Value ");
		Employee e=emp.getValue();
		if(e.eno.equals(val)||e.ename.equals(val)||e.designation.equals(val))
		{
			System.out.println(e.eno+" "+e.ename+" "+e.designation);
		}
		}
	}
	void compareData()
	{
		System.out.println("Data Before Sorting");
		System.out.println("==============================================================");
		ArrayList<Employee> l=new ArrayList<Employee>();
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
		l.forEach(System.out::println);
		System.out.println("Data After Sorting");
		System.out.println("==============================================================");
		Collections.sort(l,new SortByNameAndDesign());
		l.forEach(System.out::println);
	}
}

public class EmployeeMap {

	public static void main(String[] args) {
		MapData m=new MapData();
		m.storeData();
		Scanner sc=new Scanner(System.in);
		Scanner sc1=new Scanner(System.in);
		System.out.println("Enter the Key : ");
		int key=sc.nextInt();
		System.out.println("Enter the Value : ");
		String val=sc1.nextLine();
		m.retrieveData(key,val);
		m.compareData();
	}

}
