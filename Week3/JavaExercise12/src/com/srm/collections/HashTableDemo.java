package com.srm.collections;

import java.util.Hashtable;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeSet;
class Hashing
{
	void printTable(Hashtable<Integer,MyOwnClass> ht)
	{
		System.out.println("HashTable Elements");
		for(Map.Entry map:ht.entrySet())
		{
			System.out.println(map.getKey()+" "+map.getValue());
		}
	}
}
public class HashTableDemo {

	public static void main(String[] args) {
		System.out.println("Ënter the No.of.Elements : ");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		Hashtable<Integer, MyOwnClass> ht=new Hashtable<Integer,MyOwnClass>();
		System.out.println(ht.size());
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter the Name - Enter the Age");
			ht.put(i,new MyOwnClass(sc.next(), sc.nextInt()));
		}
		Hashing h=new Hashing();
		h.printTable(ht);
	}

}
