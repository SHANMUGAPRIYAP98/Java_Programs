package com.srm.strings;

import java.util.Scanner;

class Person
{
	String name,mail;
	int age;
	long phoneNo;
	Person(String name,String mail,int age,long phoneNo)
	{
		this.name=name;
		this.age=age;
		this.mail=mail;
		this.phoneNo=phoneNo;
	}
	void printData()
	{
		System.out.println("Name : "+name);
		System.out.println("Age : "+age);
		System.out.println("Mail-Id : "+mail);
		System.out.println("Phone Number : "+phoneNo);
	}
}
public class ObjectsDemo {
	public static void main(String[] args) {
		String name,mail;
		int age;
		long phno;
		System.out.println("Enter the Name : ");
		Scanner sc=new Scanner(System.in);
		name=sc.next();
		System.out.println("Enter the Age : ");
		age=sc.nextInt();
		System.out.println("Enter the Mail : ");
		mail=sc.next();
		System.out.println("Enter the Phone No : ");
		phno=sc.nextLong();
		Person p=new Person(name,mail,age,phno);
		p.printData();
		
	}

}
