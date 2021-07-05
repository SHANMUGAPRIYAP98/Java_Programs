package com.srm.collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

class HashDemo
{
	void printData(HashSet<String> s1,HashSet<Integer> i1,HashSet<MyOwnClass> ob)
	{
		System.out.println("Set String Elements");
		Iterator iter=s1.iterator();
		while(iter.hasNext())
		{
			System.out.print(iter.next()+"\t");
		}
		System.out.println();
		System.out.println("Set Integer Elements");
		Iterator iter1=i1.iterator();
		while(iter1.hasNext())
		{
			System.out.print(iter1.next()+"\t");
		}
		System.out.println();
		System.out.println("Set OwnClass Elements");
		Iterator iter2=ob.iterator();
		while(iter2.hasNext())
		{
			System.out.println(iter2.next());
		}
	}
}





public class HashSetDemo {

	public static void main(String[] args) {
		System.out.println("Ënter the No.of.Elements : ");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		Set<String> hs1=new HashSet<>();
		Set<Integer> hs2=new HashSet<>();
		Set<MyOwnClass> hs3=new HashSet<>();
		System.out.println("Add String Elements : ");
		for(int i=0;i<n;i++)
		{
			hs1.add(sc.next());
		}
		System.out.println("Add Integer Elements : ");
		for(int i=0;i<n;i++)
		{
			hs2.add(sc.nextInt());
		}
		String name;
		int age;
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter the Name - Enter the Age");
			
			hs3.add(new MyOwnClass(sc.next(),sc.nextInt()));
		}
		HashDemo hd=new HashDemo();
		hd.printData((HashSet<String>) hs1, (HashSet<Integer>) hs2,(HashSet<MyOwnClass>) hs3);
	}

}
