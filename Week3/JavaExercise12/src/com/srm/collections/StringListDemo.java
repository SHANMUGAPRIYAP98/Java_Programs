package com.srm.collections;

import java.util.ArrayList;
import java.util.Scanner;

class StringList
{
	String data;
	void removeEvenLen(ArrayList<String> al)
	{
		System.out.println("String ArrayList : ");
		al.forEach(System.out::println);
		System.out.println("--------------------------------------------------");
		System.out.println("String with Even Length");
		for(int i=0;i<al.size();i++)
		{
			data=al.get(i);
			if(data.length()%2==0)
			{
				System.out.println(data+"\t"+data.length());
				al.remove(i);
			}
		}
		System.out.println();
		System.out.println("--------------------------------------------------");
		System.out.println("ArrayList After Even Length Removal");
		al.forEach(System.out::println);
	}
}


public class StringListDemo {

	public static void main(String[] args) {
		System.out.println("Enter the Elements to be Added to the List : ");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int i=0;
		ArrayList<String> al=new ArrayList<String>();
		while(i<n)
		{
			al.add(sc.next());
			i++;
		}
		StringList sl=new StringList();
		sl.removeEvenLen(al);
	}

}
