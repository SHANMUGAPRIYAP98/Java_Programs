package com.srm.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

class MinMax
{
	void findMinMax(ArrayList<Integer> l)
	{
		System.out.println("ArrayList Elements");
		l.forEach(System.out::println);
		Collections.sort(l);
		System.out.println("ArrayList Elements After Sorting");
		l.forEach(System.out::println);
		System.out.println("Minimum Value : "+l.get(0));
		System.out.println("Maximum Value : "+l.get(l.size()-1));
	}
}

public class MinMaxDemo {
	public static void main(String[] args) {
		System.out.println("Enter the No.of.Elements : ");
		Scanner sc=new Scanner(System.in);
		int no=sc.nextInt();
		List l=new ArrayList<Double>();
		for(int i=0;i<no;i++)
		{
			System.out.println("Enter the Element "+(i+1));
			l.add(sc.nextInt());
		}
		MinMax mm=new MinMax();
		mm.findMinMax((ArrayList)l);
	}

}
