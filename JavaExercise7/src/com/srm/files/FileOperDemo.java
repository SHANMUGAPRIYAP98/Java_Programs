package com.srm.files;

import java.io.File;
import java.util.Scanner;

public class FileOperDemo {

	public static void main(String[] args) {
		
		System.out.println("Enter the Location of the File : ");
		Scanner sc=new Scanner(System.in);
		String path =sc.nextLine();
		File f=new File(path);
		String data=f.getName();
		System.out.println("File Name : "+f.getName());
		System.out.println("File Exists : "+f.exists());
		System.out.println("Is File Writable : "+f.canWrite());
		System.out.println("Is File Readable : "+f.canRead());
		System.out.println("File Length : "+f.length());
		System.out.println("Type of File : ");
	}

}
