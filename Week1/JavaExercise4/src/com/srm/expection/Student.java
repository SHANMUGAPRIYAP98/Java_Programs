package com.srm.expection;

import java.util.Scanner;

class Student {
	long regno;
	String name;
	double[] marks=new double[3];
	Student(long regno,String name)
	{
		this.regno=regno;
		this.name=name;
	}
	double total;
	void checkMarks(double[] arr)
	{
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]<40)
			{
				throw new ArithmeticException("Marks Below 40 are considered as Arrear");
			}
			else
			{
				total=total+arr[i];
			
			}
		}
		System.out.println("Total : "+total);
	}
	
}