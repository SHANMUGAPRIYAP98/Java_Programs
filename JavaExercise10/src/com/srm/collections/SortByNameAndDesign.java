package com.srm.collections;

import java.util.Comparator;

public class SortByNameAndDesign implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {
		if(o1.ename.compareTo(o2.ename)==0)
		{
			return o1.designation.compareTo(o1.designation);
		}
		else
		{
			return o1.ename.compareTo(o2.ename);
		}
	}

}
