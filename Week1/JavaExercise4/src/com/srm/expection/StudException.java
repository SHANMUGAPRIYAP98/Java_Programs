package com.srm.expection;

import java.util.Scanner;

public class StudException {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Scanner sc1=new Scanner(System.in);
		System.out.println("Enter the Register No : ");
		long regno=sc.nextLong();
		System.out.println("Enter the  Name: ");
		String name=sc1.nextLine();
		double[] arr=new double[3];
		for(int i=0;i<arr.length;i++)
		{
			System.out.println("Enter the Marks"+(i+1));
			arr[i]=sc.nextDouble();
		}
		Student s1=new Student(regno, name);
		s1.checkMarks(arr);

	}

}
