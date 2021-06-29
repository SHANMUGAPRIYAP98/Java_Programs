package com.srm.files;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class CaseConversion {

	public static void main(String[] args) {
		System.out.println("Enter the Location of the File to Read : ");
		Scanner sc = new Scanner(System.in);
		String path = sc.nextLine();
		String data = "";
		String rdata = "";
		String path1="D:\\Star Finance\\LinkUpper.txt";
		String path2="D:\\Star Finance\\LinkLowe.txt";
		try (BufferedReader br = new BufferedReader(new FileReader(path))) {
			while ((data = br.readLine()) != null) {
				rdata = rdata + data;
			}
			FileWriter f1=new FileWriter(path1);
			f1.write(rdata.toUpperCase());
			f1.close();
			FileWriter f2=new FileWriter(path2);
			f2.write(rdata.toLowerCase());
			f2.close();

		} catch (IOException e) {
			System.out.println(e);
		}

	}

}
