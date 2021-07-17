package com.srm.streams.prog;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class StreamsExamples {
	static void manipulate(List<Integer> l1,List<Integer> l2)
	{
		List<Integer> ls1=l1.stream().filter(x->x%2==0).map(y->y+1).collect(Collectors.toList());
		System.out.println(ls1);
		List<Integer> ls2=l2.stream().filter(x->x%2!=0).map(y->y+1).collect(Collectors.toList());
		System.out.println(ls2);
		int res=l1.stream().filter(i->i>0).mapToInt(i->i).sum();
		System.out.println(res);
		
	}
	public static void main(String[] args) {
	System.out.println("Enter the No.of.Elements : ");
	Scanner sc=new Scanner(System.in);
	int Num=sc.nextInt();
	List<Integer> ls1=new ArrayList<Integer>();
	List<Integer> ls2=new ArrayList<Integer>();
	for(int i=0;i<Num;i++)
	{
		System.out.println("Enter Value for List1 : ");
		ls1.add(sc.nextInt());
		System.out.println("Enter Value for List12 : ");
		ls2.add(sc.nextInt());
	}
	manipulate(ls1,ls2);
	}

}