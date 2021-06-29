package com.srm.collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

class CheckData
{
	void checkValue(LinkedList l)
	{
		System.out.println("LinkedList Elements are : ");
		l.forEach(System.out::println);
		Scanner sc=new Scanner(System.in);
		String data=sc.nextLine();
		int ind=l.indexOf(data);
		if(ind<0)
		{
			System.out.println("Element Doesn't Exists");
		}
		else
		{
			System.out.println("Element Present in Index "+ind+" of Value "+l.get(ind));
		}
	}
}


public class CheckElement {

	public static void main(String[] args) {
		List l=new LinkedList<>();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the No.of.Elements : ");
		int no=sc.nextInt();
		for(int i=0;i<no;i++)
		{
			System.out.println("Enter the Element "+(i+1));
			l.add(sc.next());
		}
		CheckData cd=new CheckData();
		cd.checkValue((LinkedList)l);
	}

}
