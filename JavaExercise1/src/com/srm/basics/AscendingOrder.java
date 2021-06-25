package com.srm.basics;

import java.util.Arrays;
import java.util.Scanner;

public class AscendingOrder {
	public static void main(String args[])
	{
		System.out.println("Enter the No.of.Elements : ");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("Elements Before Sorting : ");
		for(int i:arr)
		{
			System.out.print(i+" ");
		}
		System.out.println();
		System.out.println("Elements After Sorting : ");
		int temp=0;
		for(int i=0;i<arr.length;i++)
		{
			for(int j=1;j<arr.length-i;j++)
			{
			 if(arr[j-1]>arr[j])
			 {
				temp=arr[j-1];
				arr[j-1]=arr[j];
				arr[j]=temp;
			 }
			}
		}
		for(int i:arr)
		{
			System.out.print(i+" ");
		}
	}
}
