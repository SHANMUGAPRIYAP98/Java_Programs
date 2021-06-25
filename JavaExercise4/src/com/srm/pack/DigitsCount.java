package com.srm.pack;

public class DigitsCount {

	public static void main(String[] args) {
		String[] a= {"1","aaa","2","bbb"};
		int len=a.length;
		int count=0;
		System.out.println("Length : "+len);
		for(int i=0;i<a.length;i++)
		{
		if(a[i].matches("^[0-9]+$"))
		{
		count++;
		}
		}
		System.out.println("Count of Digits : "+count);

	}

}
