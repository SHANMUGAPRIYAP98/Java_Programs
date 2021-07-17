package com.srm.regex;

import java.util.Scanner;

public class Email {
	public static void main(String[] args) {
		String email_regex="^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$";
		System.out.println("Enter the Email-Address : ");
		Scanner sc=new Scanner(System.in);
		String mail=sc.next();
		if(mail.matches(email_regex))
		{
			System.out.println(mail+" Valid Email Address");
		}
		else
		{
			System.out.println(mail+" Invalid Email Address");
		}
	}

}
