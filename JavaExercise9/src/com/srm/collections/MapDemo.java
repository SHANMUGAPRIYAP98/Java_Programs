package com.srm.collections;

import java.util.HashMap;
import java.util.Map;

class Hash {
	HashMap<Integer, String> hm = new HashMap<Integer, String>();

	void addData() {
		hm.put(101, "Diyashri");
		hm.put(102, "Hari Krishna");
		hm.put(103, "Parthiban");
		hm.put(104, "Usha Rani");
		hm.put(105, "Nagaraj");
	}
	void retrieve()
	{
		for(Map.Entry map:hm.entrySet())
		{
			System.out.println("Key : "+map.getKey()+" Value : "+map.getValue());
		}
	}
}

public class MapDemo {

	public static void main(String[] args) {
		Hash h=new Hash();
		h.addData();
		h.retrieve();
	}

}
