package com.srm.regex;

import java.util.Scanner;

public class UnamePass {
	public static void main(String[] args) {
		String email_regex="^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$";
		String pass_regex="(?=^.{8,}$)((?=.*\\d)|(?=.*\\W+))(?![.\\n])(?=.*[A-Z])(?=.*[a-z]).*$";
		System.out.println("Enter the Email Address : ");
		Scanner sc=new Scanner(System.in);
		String name=sc.next();
		System.out.println("Enter the Password : ");
		String pass=sc.next();
		if(name.matches(email_regex)&&pass.matches(pass_regex))
		{
			System.out.println("Username : "+name);
			System.out.println("Password : "+pass.replaceAll(pass.substring(0),"********"));
			System.out.println("Logged In Successful");
		}
		else
		{
			System.out.println("Logged In Failed");
		}
		

	}

}
