package com.srm.basics;

import java.util.Scanner;

public class ArmStrong {

	public static void main(String[] args) {

		System.out.println("Enter the Number : ");
		Scanner sc=new Scanner(System.in);
		int number=sc.nextInt();
		int digits=0,sum=0;
		int temp=number;
		for(int i=number;number>0;number=number/10)
		{
			digits=number%10;
			sum+=Math.pow(digits,3);
		}
		System.out.println("Sum of Cube of Digits : "+sum);
		if(sum==temp)
		{
			System.out.println(temp+" is an Armstrong Number");
		}
		else
		{
			System.out.println(temp+" is not an Armstrong Number");
		}
	}

}
