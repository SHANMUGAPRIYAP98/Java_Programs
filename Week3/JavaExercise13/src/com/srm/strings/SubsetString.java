package com.srm.strings;

import java.util.Scanner;

public class SubsetString {
	public static void main(String[] args) {
		System.out.println("Enter the String : ");
		Scanner sc = new Scanner(System.in);
		String data = sc.next();
		int len = data.length();
		int temp = 0;
		String str[] = new String[len * (len + 1) / 2];
		for (int i = 0; i < len; i++) {
			for (int j = i; j <len; j++) {
				str[temp] = data.substring(i, j + 1);
				temp++;
			}
		}
		System.out.println("Subset Strings : ");
		for (int i = 0; i < str.length; i++) {
			System.out.println("{"+str[i]+"}");
		}
	}
}
