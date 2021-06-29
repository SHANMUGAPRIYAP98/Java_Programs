package com.srm.collections;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

class SetDemo
{
	
	void addData(TreeSet<Integer> ts)
	{
		int sum=0;
		Integer[] arr=new Integer[ts.size()];
		arr=ts.toArray(arr);
		for(int i=0;i<ts.size();i++)
		{
			sum=sum+arr[i];
		}
		System.out.println("Sum of the Numbers : "+sum);	
	}
	void addElem(TreeSet<Integer> ts)
	{
		int sum=0;
		int i=0;
		Integer[] arr=new Integer[ts.size()];
		arr= ts.toArray(arr);
		while(i<ts.size())
		{
			sum=sum+arr[i];
			i++;
		}
		System.out.println("Sum of the Numbers : "+sum);	
	}
	void callAgain(TreeSet<Integer> ts,int size)
	{
		int sum=0;
		Integer[] arr=new Integer[size];
		arr=ts.toArray(arr);
		if(ts.isEmpty())
		{
			System.out.println("Sum of the Numbers : "+sum);
		}
		else
		{
			
		}
	}
}
public class TreeSetDemo {

	public static void main(String[] args) {
		TreeSet<Integer> s=new TreeSet<Integer>();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the No.of.Elements : ");
		int no=sc.nextInt();
		for(int i=0;i<no;i++)
		{
			System.out.println("Enter the Element "+(i+1));
			s.add(sc.nextInt());
		}
		SetDemo sd=new SetDemo();
		sd.addData(s);
		sd.addElem(s);
		sd.callAgain(s, no);
	}

}
