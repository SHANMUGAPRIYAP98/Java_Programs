package com.srm.basics;

import java.util.Scanner;

public class CountOddEven {

	public static void main(String[] args) {
		System.out.println("Enter the Number : ");
		Scanner sc=new Scanner(System.in);
		int number=sc.nextInt();
		String val=String.valueOf(number);
		int count=0,count1=0;
		int newVal;
		for(int i=0;i<val.length();i++)
		{
			char ch=val.charAt(i);
			newVal=ch;
			if(newVal%2==0)
			{
				count=count+1;
			}
			else
			{
				//System.out.print("Odd Numbers + "+newVal+" ");
				count1=count1+1;
			}
		}
		System.out.println(count+" Even Numbers in "+val);
		System.out.println(count1+" Odd Numbers in "+val);
	}

}
