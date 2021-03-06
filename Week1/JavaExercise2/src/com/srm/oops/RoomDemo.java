package com.srm.oops;

import java.util.Scanner;

class Room
{
	String roomNo;
	String roomType;
	float roomArea;
	boolean ACMachine;
	Room(String roomNo,String roomType,float roomArea,boolean ACMachine)
	{
		this.roomNo=roomNo;
		this.roomType=roomType;
		this.roomArea=roomArea;
		this.ACMachine=ACMachine;
	}
	void setData(String roomNo,String roomType,float roomArea,boolean ACMachine)
	{
		this.roomNo=roomNo;
		this.roomType=roomType;
		this.roomArea=roomArea;
		this.ACMachine=ACMachine;
	}
	void display()
	{
		
		System.out.println("Room No : "+this.roomNo);
		System.out.println("Room Type : "+this.roomType);
		System.out.println("Room Area : "+this.roomArea);
		if(this.ACMachine==true)
		{
			System.out.println("AC Available");
		}
		else
		{
			System.out.println("AC not Available");
		}
		
	}
	Room()
	{
		
	}
}
public class RoomDemo {

	public static void main(String[] args) {
		System.out.println("Enter the Room No : ");
		Scanner sc=new Scanner(System.in);
		String roomNo=sc.nextLine();
		System.out.println("Enter the Room Type : ");
		String rtype=sc.nextLine();
		System.out.println("Enter the Room Area : ");
		float rarea=sc.nextFloat();
		System.out.println("Is AC Available : ");
		boolean ac=sc.nextBoolean();
		Room r1=new Room(roomNo, rtype, rarea, ac);
		r1.setData(roomNo, rtype, rarea, ac);
		r1.display();
		Scanner sc1=new Scanner(System.in);
		System.out.println("Enter the Room No : ");
		String roomNo1=sc1.nextLine();
		System.out.println("Enter the Room Type : ");
		String rtype1=sc1.nextLine();
		System.out.println("Enter the Room Area : ");
		float rarea1=sc1.nextFloat();
		System.out.println("Is AC Available : ");
		boolean ac1=sc1.nextBoolean();
		Room r2=new Room();
		r2.setData(roomNo1,rtype1,rarea1,ac1);
		r2.display();

	}

}
