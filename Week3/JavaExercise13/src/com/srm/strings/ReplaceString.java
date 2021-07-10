package com.srm.strings;

import java.util.Scanner;

public class ReplaceString {
	public static void main(String[] args) {
		System.out.println("Enter the String : ");
		Scanner sc=new Scanner(System.in);
		String data=sc.nextLine();
		System.out.println("Enter the Charcter to be Replaced : ");
		char ch=sc.next().charAt(0);
		System.out.println("Enter the Charcter to be Replaced with : ");
		char ch1=sc.next().charAt(0);
		String newStr=data.replace(ch, ch1);
		System.out.println("Old String : "+data);
		System.out.println("New String : "+newStr);

	}

}
