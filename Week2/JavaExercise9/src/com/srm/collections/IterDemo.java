package com.srm.collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

class Iter
{
	List l=new ArrayList<Integer>();
	Set s=new TreeSet<String>();
	void addList()
	{
		l.add(101);
		l.add(102);
		l.add(103);
		l.add(104);
		l.add(105);
		Iterator iter=l.listIterator();
		System.out.println("ListIterator Demo");
		while(iter.hasNext())
		{
			System.out.println(iter.next());
		}
		System.out.println("==================================================");
		s.add("Senior HR");
		s.add("Junior HR");
		s.add("Trainee");
		s.add("Programmer");
		s.add("Developer");
		System.out.println("Iterator Demo");
		Iterator itr=s.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
	}
}
public class IterDemo {
	public static void main(String[] args) {
			Iter i=new Iter();
			i.addList();
	}

}
