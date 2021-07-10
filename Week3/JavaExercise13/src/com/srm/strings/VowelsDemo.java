package com.srm.strings;

import java.util.Scanner;
class Vowels
{
	void findVowelAndWord(String str)
	{
		int count=0;
		String[] data=str.split("\\s");
		System.out.println("No.of.Words : "+data.length);
		for(int i=0;i<str.length();i++)
		{
			str.toLowerCase();
			char ch=str.charAt(i);
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
			{
				count++;
			}
		}
		System.out.println("Vowels Count : "+count);
	}
}
public class VowelsDemo {
	public static void main(String[] args) {
		System.out.println("Enter the String Data : ");
		Scanner sc=new Scanner(System.in);
		String data=sc.nextLine();
		Vowels v=new Vowels();
		v.findVowelAndWord(data);
	}

}
