package com.srm.basic;

import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeserializeData {

	public static void main(String[] args) {
		try {
			FileInputStream readFile=new FileInputStream("D:\\serialize.txt");
			try {
				ObjectInputStream ob=new ObjectInputStream(readFile);
				try {
					BankOper bank=(BankOper)ob.readObject();
					FileWriter fw=new FileWriter("D:\\Deserialize.txt");
					fw.write(bank.toString());
					fw.flush();
					fw.close();
				} catch (ClassNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
