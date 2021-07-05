package com.srm.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

class MinVal
{
	void findMin(ArrayList al)
	{
		Iterator<Integer> iter=al.iterator();
		System.out.println("Before Finding Minimum Value");
		System.out.print("{");
		while(iter.hasNext())
		{
			System.out.print(iter.next()+",");
		}
		System.out.print("}");
		Collections.sort(al);
		System.out.println();
		System.out.println("After Finding Minimum Value");
		Iterator<Integer> iter1=al.iterator();
		System.out.print("{");
		while(iter1.hasNext())
		{
			System.out.print(iter1.next()+",");
		}
		System.out.print("}");
	}
}

public class MinValArrayList {

	public static void main(String[] args) {
		MinVal mv=new MinVal();
		System.out.println("Enter the No.of.Elements : ");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		ArrayList<Integer> al=new ArrayList<Integer>();
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter the Element "+(i+1));
			al.add(sc.nextInt());
		}
		mv.findMin(al);

	}

}
