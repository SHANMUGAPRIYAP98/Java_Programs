package com.srm.test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

class ArrayLists
{
	void displayAddElem(ArrayList<Integer> al)
	{
		System.out.println("Retrieve Elements");
		Iterator iter=al.iterator();
		while(iter.hasNext())
		{
			System.out.print(iter.next()+"\t");
		}
	}
	void removeElem(ArrayList<Integer> al,int index)
	{
		al.remove(index);
		System.out.println("Elements after Removal");
		for(int i=0;i<al.size();i++)
		{
			System.out.print(al.get(i)+"\t");
		}
	}
}

public class ArrayListDemo {
	public static void main(String[] args) {
		System.out.println("Enter the Size of the ArrayList : ");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		ArrayList<Integer> al=new ArrayList<Integer>();
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter the Element : "+(i+1));
			al.add(sc.nextInt());
		}
		ArrayLists als=new ArrayLists();
		als.displayAddElem(al);
		System.out.println();
		System.out.println("Enter the Index to Remove the Element : ");
		int ind=sc.nextInt();
		als.removeElem(al, ind);

	}

}
