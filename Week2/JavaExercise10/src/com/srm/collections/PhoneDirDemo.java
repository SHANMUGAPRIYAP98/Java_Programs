package com.srm.collections;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

class TreeMapDemo
{
	void findData(TreeMap<Long,String> tm,Long phone,String name)
	{
		for(Map.Entry m :tm.entrySet())
		{
			System.out.println(m.getKey()+" "+m.getValue());
		}
		for(Map.Entry m :tm.entrySet())
		{
			if(m.getKey().equals(phone))
			{
				System.out.println("Corresponding Value : "+m.getValue());
			}
			if(m.getValue().equals(name))
			{
				System.out.println("Corresponding Key : "+m.getKey());
			}
			
		}
		
	}
}
public class PhoneDirDemo {

	public static void main(String[] args) {
		TreeMapDemo tm=new TreeMapDemo();
		Scanner sc=new Scanner(System.in);
		Scanner sc1=new Scanner(System.in);
		System.out.println("Enter the Phone No : ");
		Long l=sc.nextLong();
		System.out.println("Enter the Name : ");
		String name = sc1.nextLine();
		TreeMap<Long,String> m=new TreeMap<Long,String>();
		m.put(9840515309l, "Diyashri");
		m.put(9840425389l, "Sandhya");
		m.put(8939866779l, "Shanmuga Priya");
		m.put(9841215309l, "Parthiban");
		m.put(9043897203l, "Usha Rani");
		m.put(7358321669l, "Akshayaa");
		m.put(9812346789l, "Kaviya");
		m.put(8997654321l, "Renuka");
		m.put(9087654321l, "Vinitha");
		tm.findData(m,l,name);
	}

}
