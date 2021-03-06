package com.srm.oops;

import java.util.Scanner;

class Numbers
{
	private double value;
	Numbers(double value)
	{
		this.value=value;
	}
	boolean isZero()
	{
		if(this.value==0)
		{
			System.out.println("The Given Value is : "+this.value);
			return true;
		}
		else
		{
			System.out.println("The Given Value is : "+this.value+" - Non-Zero Value");
			return false;
		}
	}
	boolean isPositive(double value)
	{
		if(value>0)
		{
			System.out.println(value+" is a positive number");
			return true;
		}
		else
		{
			return false;
		}
		
	}
	boolean isNegative(double value)
	{
		if(value<0)
		{
			System.out.println(value+" is a negative number");
			return true;
		}
		else
		{
			return false;
		}
	}
	boolean isOdd()
	{
		if(this.value%2!=0)
		{
			System.out.println(this.value+" is a odd number");
			return true;
		}
		else
		{
			return false;
		}
	}
	boolean isEven()
	{
		if(this.value%2==0)
		{
			System.out.println(this.value+" is a even number");
			return true;
		}
		else
		{
			return false;
		}
	}
	boolean flag=false;
	boolean isPrime()
	{
		this.value=(int)this.value;
		for(int i=2;i<=this.value/2;i++)
		{
			if(this.value%i==0)
			{
				System.out.println(this.value+" is not a prime number");
				flag=true;
				break;
			}
		}
		if(flag==false)
		{
			System.out.println(this.value+" is a prime number");
		}
		return true;
	}
	boolean isArmStrong()
	{
		int temp=(int)this.value;
		System.out.println(temp);
		int sum=0,digits=0;
		while(this.value!=0)
		{
			digits=(int)this.value%10;
			sum=(int) (sum+Math.pow(digits,3));
			this.value=this.value/10;
		}
		if(temp==sum)
		{
			System.out.println(temp+" is an ArmStrong Number");
		}
		else
		{
			System.out.println(temp+" is not an ArmStrong Number");
		}
		return true;
	}
	double factorial(double num)
	{
		int fact=1,count=1;
		int n=(int)num;
		System.out.println(n);
		for(;count<=n;count++)
		{
			fact=fact*count;
		}
		System.out.println("Factorial : "+fact);
		return fact;
	}
	double sqr(double num)
	{
		return num*num;
	}
	double sqrt(double num)
	{
		return Math.sqrt(num);
	}
	double sumOfDigits(double num)
	{
		double digits=0,sum=0;
		while(num!=0)
		{
			digits=num%10;
			sum=sum+digits;
			num=num/10;
		}
		System.out.println("Sum of the Digits : "+sum);
		return sum;
	}
	double reverse(double num)
	{
		int rev=0,digits=0;
		while((int)num!=0)
		{
			digits=(int)num%10;
			rev=rev*10+digits;
			num=num/10;
		}
		System.out.println("Reverse of a Number : "+rev);
		return rev;
	}
	void factors(double num)
	{
		for(int i=2;i<=(int)num;i++)
		{
			if(num%i==0)
			{
				System.out.print("Factors of  : "+this.value+"are "+i+"\t");
			}
		}
	}
}
public class NumberDemo {

	public static void main(String[] args) {
		System.out.println("Enter the Number : ");
		Scanner sc=new Scanner(System.in);
		double num=sc.nextDouble();
		Numbers n=new Numbers(num);
		n.isZero();
		n.isPositive(num);
		n.isNegative(num);
		n.isEven();
		n.isOdd();
		n.isPrime();
		n.isArmStrong();
		n.factorial(num);
		double square=n.sqr(num);
		System.out.println("Square of Digits : "+square);
		double sqrt=n.sqrt(num);
		System.out.println("Square Root of Digits : "+sqrt);
		n.reverse(num);
		n.sumOfDigits(num);
		n.factors(num);
	}

}
