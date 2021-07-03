package com.srm.arrays;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class HashTableDemo{

public static void main(String[] args) {
	Hashtable<Long,String> ht=new Hashtable<Long,String>();
	ht.put(9840515309l, "Diyashri");
	ht.put(9840425389l, "Sandhya");
	ht.put(8939866779l, "Shanmuga Priya");
	ht.put(9841215309l, "Parthiban");
	ht.put(9043897203l, "Usha Rani");
	ht.put(7358321669l, "Akshayaa");
	ht.put(9812346789l, "Kaviya");
	ht.put(8997654321l, "Renuka");
	ht.put(9087654321l, "Vinitha");
	System.out.println("HastTable Data");
	System.out.println(ht);
	ht.putIfAbsent(9845123456l, "Ramya");
	System.out.println("=============================================");
	System.out.println(ht);
	System.out.println("Get or Print Default Data");
	System.out.println(ht.getOrDefault(9840515309l,"Data No Available"));
	System.out.println(ht.getOrDefault(9840515308l,"Data No Available"));
}
}

