package com.srm.collections;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class PropertiesDemo {

	public static void main(String[] args) throws IOException {
		Properties prop=new Properties();
		prop.setProperty("RegisterNo","101");
		prop.setProperty("Name","Diyashri");
		prop.setProperty("EmailId","diya@yahoo.com");
		prop.setProperty("FatherName","Nagaraj");
		prop.setProperty("MotherName","Sandhya");
		prop.setProperty("DOB","28-06-2015");
		prop.store( new FileWriter("personal_details.properties"),"Personal Info");
		FileReader fr=new FileReader("personal_details.properties");
		prop.load(fr);
		System.out.println(prop.getProperty("Name"));
		System.out.println(prop.getProperty("EmailId"));
		System.out.println(prop.getProperty("DOB"));
	}

}
