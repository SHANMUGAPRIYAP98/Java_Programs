package com.srm.collections;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Scanner;
import java.util.TreeSet;

class DuplicateArr
{
	void findDup(Integer[] arr)
	{
		List l=Arrays.asList(arr);
		TreeSet<Integer> ts=new TreeSet<>();
		System.out.println();
		System.out.println("Duplicated Element");
		for(Integer i:arr)
		{
			if(!ts.add(i))
			{
				System.out.println(i);
			}
		}
		System.out.println("Elements After Duplication");
		ts.addAll(l);
		for(Integer i:ts)
		{
				System.out.print(i+"\t");
		}
	}
}



public class ArrayDupDemo {
	public static void main(String[] args) {
		DuplicateArr d=new DuplicateArr();
		System.out.println("Enter the Size of the Array : ");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		Integer[] arr=new Integer[n];
		for(int i=0;i<arr.length;i++)
		{
			System.out.println("Enter the Element "+(i+1));
			arr[i]=sc.nextInt();
		}
		System.out.println("Array Elements");
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+"\t");
			
		}
		d.findDup(arr);
	}

}
