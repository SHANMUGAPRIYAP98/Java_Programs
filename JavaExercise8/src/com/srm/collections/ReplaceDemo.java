package com.srm.collections;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class ReplaceElement
{
	void replaceElement(List l)
	{
		System.out.println("ArrayList Elements");
		l.forEach(System.out::println);
		System.out.println("Enter the Element to be Replaced");
		Scanner sc=new Scanner(System.in);
		String data=sc.next();
		System.out.println("Enter the Element to be Replaced with ");
		String replace=sc.next();
		int ind=l.indexOf(data);
		l.set(ind, replace);
		System.out.println("ArrayList After Replacement");
		l.forEach(System.out::println);
	}
}

public class ReplaceDemo {

	public static void main(String[] args) {
		ReplaceElement re=new ReplaceElement();
		List l=new ArrayList<Integer>();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the No.of.Elements : ");
		int no=sc.nextInt();
		for(int i=0;i<no;i++)
		{
			System.out.println("Enter the Element "+(i+1));
			l.add(sc.next());
		}
		re.replaceElement(l);
		
	}

}
