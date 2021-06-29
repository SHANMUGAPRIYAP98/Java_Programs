package com.srm.generics;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FindMaxValue {
	public static void main(String[] args) {
		List l=new ArrayList<Double>();
        l.add(20);
        l.add(100);
        l.add(15);
        l.add(2);
        l.add(-2);
        l.add(-3);
        Collections.sort(l);
        l.forEach(System.out::println);
	}

}
