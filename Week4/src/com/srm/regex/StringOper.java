package com.srm.regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringOper {

	public static void main(String[] args) {
		System.out.println("Enter the String : ");
		Scanner sc=new Scanner(System.in);
		String sen=sc.nextLine();
		String[] split=sen.split("\\s");
		for(int i=0;i<split.length;i++)
		{
			System.out.println(split[i]);
		}
		System.out.println();
		System.out.println("Enter the word to Find : ");
		String find=sc.next();
		if(sen.contains(find))
		{
			System.out.println(find+" is found in "+sen.indexOf(find));
		}
		else
		{
			System.out.println("Not Available");
		}
		System.out.println();
		Pattern pat=Pattern.compile("hii");
		Matcher m=pat.matcher("hiihellohihellohii");  
        while(m.find())  
        	System.out.println( "Group "+m.group());  
        }     
	}

