package com.srm.collections;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

class SetDemo {

	void addData(TreeSet<Integer> ts) {
		int sum = 0;
		Integer[] arr = new Integer[ts.size()];
		arr = ts.toArray(arr);
		for (int i = 0; i < ts.size(); i++) {
			sum = sum + arr[i];
		}
		System.out.println("Sum of the Numbers : " + sum);
	}

	void addElem(TreeSet<Integer> ts) {
		int sum = 0;
		int i = 0;
		Integer[] arr = new Integer[ts.size()];
		arr = ts.toArray(arr);
		while (i < ts.size()) {
			sum = sum + arr[i];
			i++;
		}
		System.out.println("Sum of the Numbers : " + sum);
	}

//	int callAgain(Integer[] ts,int size) {
//		int sum = 0;
//		if (ts.length <= 0) {
//			System.out.println("Sum of the Numbers : " + sum);
//		}
//		return callAgain(ts,size-1)+ts[size-1];
//	}
//	int recursion(int[] arr,int size)
//	{
//		if(size <=0)
//		{
//			return 0;
//		}
//		return recursion(arr, size-1)+arr[size-1];
//	}

}

public class TreeSetDemo {

	public static void main(String[] args) {
		TreeSet<Integer> s = new TreeSet<Integer>();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the No.of.Elements : ");
		int no = sc.nextInt();
		int res = 0;
		for (int i = 0; i < no; i++) {
			System.out.println("Enter the Element " + (i + 1));
			s.add(sc.nextInt());
		}
		SetDemo sd = new SetDemo();
		sd.addData(s);
		sd.addElem(s);
		Integer[] arr = new Integer[s.size()];
		s.toArray(arr);
		int[] arr1= {1,2,3,4,5};
//		res = sd.callAgain(arr,arr.length);
//		System.out.println("Sum Using Recursion Function : " + res);
//        int res1=sd.recursion(arr1, arr1.length);
//        System.out.println(res1);
	}

}
