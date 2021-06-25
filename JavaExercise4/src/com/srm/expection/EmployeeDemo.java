package com.srm.expection;

import java.util.Scanner;

public class EmployeeDemo {

	public static void main(String[] args) throws BasicPayExec  {
		Scanner sc=new Scanner(System.in);
		Scanner sc1=new Scanner(System.in);
		System.out.println("Enter the Employee No : ");
		int eno=sc.nextInt();
		System.out.println("Enter the  Name: ");
		String name=sc1.nextLine();
		System.out.println("Enter the  Basic Pay : ");
		double bpay=sc1.nextDouble();
		Employee e=new Employee(eno,name,bpay);
		e.checkBPay(bpay);

	}

}
