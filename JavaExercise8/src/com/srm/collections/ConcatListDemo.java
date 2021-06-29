package com.srm.collections;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

class LinkedListDemo
{
	void concatList(LinkedList l1,LinkedList l2)
	{
		System.out.println("LinkedList 1 : ");
		l1.forEach(System.out::println);
		System.out.println("LinkedList 2 : ");
		l2.forEach(System.out::println);
        l1.add(l2);
		System.out.println("LinkedList After Concatinating : ");
		l1.forEach(System.out::println);
	}
}


public class ConcatListDemo {

	public static void main(String[] args) {
		List l=new LinkedList<>();
		List l1=new LinkedList<>();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the No.of.Elements : ");
		int no=sc.nextInt();
		System.out.println("LinkedList 1 : ");
		for(int i=0;i<no;i++)
		{
			System.out.println("Enter the Element "+(i+1));
			l.add(sc.next());
		}
		System.out.println("LinkedList 2 : ");
		for(int i=0;i<no;i++)
		{
			System.out.println("Enter the Element "+(i+1));
			l1.add(sc.next());
		}
		LinkedListDemo ll=new LinkedListDemo();
		ll.concatList((LinkedList)l, (LinkedList)l1);
	}

}
