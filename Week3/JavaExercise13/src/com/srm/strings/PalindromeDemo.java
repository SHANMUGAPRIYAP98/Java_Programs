package com.srm.strings;

import java.util.Scanner;

class Palindrome
{
	StringBuffer sb;
	int count=0;
	void findPalindrome(String[] str)
	{
		for(int i=0;i<str.length;i++)
		{
			sb=new StringBuffer(str[i]);
			String rev=sb.reverse().toString();
			if(rev.equals(str[i]))
			{
				System.out.println(rev+" is a Palindrome");
				count=count+1;
			}
			else
			{
				System.out.println(rev+" is not a Palindrome");
			}
		}
		System.out.println("No.of.Palindrome Strings : "+count);
	}
}

public class PalindromeDemo {

	public static void main(String[] args) {
		System.out.println("Enter the No.of.Elements : ");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println("Enter the String Elements : ");
		String[] str=new String[n];
		for(int i=0;i<n;i++)
		{
			str[i]=sc.next();
		}
		Palindrome p=new Palindrome();
		p.findPalindrome(str);

	}

}
