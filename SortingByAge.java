package com.sebone.excr.collection.basic;

import java.util.Comparator;

public class SortingByAge implements Comparator<UserData>{
   public int compare(UserData userData1,UserData userData2) {
	   return userData1.getAge()-userData2.getAge();
   }
	
}
