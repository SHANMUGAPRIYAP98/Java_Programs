package com.srm.basics;

import java.util.Scanner;

class Combination
{
	int factorial(int n)
	{
		int res=0;
			if(n==1||n==0)
			{
				res=1;
			}
			else
			{
				res=n*factorial(n-1);
			}
		return res;
	}
}
public class CombinationDemo {

	public static void main(String[] args) {
		System.out.println("Enter the n : ");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println("Enter the r : ");
		int r=sc.nextInt();
	    Combination c=new Combination();
	    int result=c.factorial(n);
		System.out.println(result);

	}

}
