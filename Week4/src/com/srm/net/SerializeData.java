package com.srm.basic;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializeData {
	public static void main(String[] args) {
		BankOper bankOper=new BankOper("Shanmuga Priya",312212345678l,9089123456l);
		try {
			FileOutputStream writeFile=new FileOutputStream("D:\\serialize.txt");
			try {
				ObjectOutputStream ob=new ObjectOutputStream(writeFile);
				ob.writeObject(bankOper);
				ob.flush();
			} catch (IOException e) {
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}
