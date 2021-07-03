package com.srm.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ArraysDemo {

	public static void main(String[] args) {
		System.out.println("Enter the No.of.Elements : ");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter the Element : ");
			arr[i]=sc.nextInt();
		}
		Arrays.sort(arr);
		System.out.println("Array Elements after Sorting : ");
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+"\t");
		}
		System.out.println();	
		System.out.println("Enter the Element to be Searched : ");
		int key=sc.nextInt();
		System.out.println(key+" is found in the location "+Arrays.binarySearch(arr,key));
		if(Arrays.binarySearch(arr,key)<0)
		{
			System.out.println("Data Not Available");
		}
	
		

	}

}
