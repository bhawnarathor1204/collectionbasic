package com.sebone.excr.collection.basic;

import java.util.Comparator;

public class SortingByRollNumber implements Comparator <UserData>{

	public int compare(UserData userData1,UserData userData2) {
		return userData1.getRollNumber()-userData2.getRollNumber();
		
	}
}
