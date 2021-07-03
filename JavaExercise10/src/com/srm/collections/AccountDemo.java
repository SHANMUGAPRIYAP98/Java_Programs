package com.srm.collections;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

class Accounts {
	void findBalance(TreeMap<Long, Double> tm, Long accno) {
		for(Map.Entry entry:tm.entrySet())
		{
			if(entry.getKey().equals(accno))
			{
				System.out.println("Balance for the Account Number  "+accno+" is "+entry.getValue()+" ₹");
			}
		}
	}
}

public class AccountDemo {

	public static void main(String[] args) {
    	Accounts acc=new Accounts();
		Scanner sc=new Scanner(System.in);
		Scanner sc1=new Scanner(System.in);
		System.out.println("Enter the Account No : ");
		Long l=sc.nextLong();
		TreeMap<Long,Double> m=new TreeMap<Long,Double>();
		m.put(312341536789l,150000d);
		m.put(312341536788l, 10000000d);
		m.put(312341536787l, 28795d);
		m.put(312341536786l, 12598d);
		m.put(312341536785l, 20000d);
		m.put(312341536784l, 6000d);
		m.put(312341536783l,200000d);
		m.put(312341536782l, 5585d);
		m.put(312341536781l,12567d);
		acc.findBalance(m, l);

	}

}
