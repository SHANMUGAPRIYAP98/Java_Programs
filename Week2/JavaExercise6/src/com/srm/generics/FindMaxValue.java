package com.srm.generics;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FindMaxValue {
	public static void main(String[] args) {
		ArrayList<Double> l=new ArrayList<Double>();
        l.add(20d);
        l.add(100d);
        l.add(15d);
        l.add(2d);
        l.add(-2d);
        l.add(-3d);
        Collections.sort(l);
        l.forEach(System.out::println);
        System.out.println("Maximum Value : "+l.get(l.size()-1));
	}

}
