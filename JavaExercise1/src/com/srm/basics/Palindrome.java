package com.srm.basics;

import java.util.Scanner;

public class Palindrome {
	public static void main(String[] args) {
		int count=0;
	 System.out.println("Enter the no.of.Strings : ");
	 Scanner sc=new Scanner(System.in);
	 int n=sc.nextInt();
	 String[] arr=new String[n];
	 for(int i=0;i<arr.length;i++) {
		 arr[i]=sc.next();
	 }
	 System.out.println("String Array");
	 System.out.print("[");
	 for(String val:arr)
	 {
		 System.out.print(val+",");
	 }
	 System.out.println("]");
	 StringBuffer sb;
	 for(int i=0;i<arr.length;i++)
	 {
		 sb=new StringBuffer(arr[i]);
		 String str1=sb.toString();
		 String str=sb.reverse().toString();
		 if(!str1.equals(str))
		 {
			 System.out.println(str+" is not a palindrome");
			
		 }
		 else
		 {
			 count=count+1;
			 System.out.println(str+" is a palindrome");
			 
		 }
	 }
	 System.out.println(count+" palindrome strings are available");
	}
	
}
