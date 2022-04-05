package com.sebone.excr.collection.basic;
import java.util.Comparator;
public class SortingByName implements Comparator<UserData>{
	
   public int compare(UserData userData1,UserData userData2) {
	   return  userData1.getName().compareTo(userData2.getName());
   }
}
