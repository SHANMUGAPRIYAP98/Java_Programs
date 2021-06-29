package com.srm.files;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class CopyContent {

	public static void main(String[] args) {
		System.out.println("Enter the Location of the File to Read : ");
		Scanner sc=new Scanner(System.in);
		String wpath="D:\\Star Finance\\CopyContent.txt";
		String path=sc.nextLine();
		String data="",wdata="";
		try(BufferedReader br=new BufferedReader(new FileReader(path)))
		{
			while((data=br.readLine())!=null)
			{
				wdata=wdata+data+"\n";
			}
			FileWriter fw=new FileWriter(wpath);
			fw.write(wdata);
			fw.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
