package com.srm.test;

import java.util.Scanner;

public class SumDigits {

	public static void main(String[] args) {
		System.out.println("Enter the Number : ");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int sum=0,digits=0;
		int temp=num;
		while(num!=0)
		{
			digits=num%10;
			sum=sum+digits;
			num=num/10;
		}
		System.out.println("Input Value : "+temp);
		System.out.println("Sum of the Digits : "+sum);

	}

}
