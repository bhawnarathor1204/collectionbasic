package com.sebone.excr.collection.basic;

import java.util.ArrayList;

/*class Name :- SortingExecution
 * Objective :- This class is the driver class of this package
 * @Author :- Bhawna Rathor
 * @Date :-21/03/2022
 */  
public class SortingExecution {

	public UserData getUser(int rollNumber,String name,int age) {
		UserData userData=new UserData();
		userData.setRollNumber(rollNumber);
		userData.setName(name);
		userData.setAge(age);
		return userData;
	}
	public static void main(String[] args) {
		SortingExecution sortingExecution=new SortingExecution();
		ArrayList<UserData> arrayList=new ArrayList<UserData>();
		arrayList.add(sortingExecution.getUser(101,"anshu",20));
		arrayList.add(sortingExecution.getUser(102,"popay",21));
		arrayList.add(sortingExecution.getUser(103,"barbi",20));
		arrayList.add(sortingExecution.getUser(104,"catrina",20));
		arrayList.add(sortingExecution.getUser(105,"doli",20));
		
		System.out.println("Original list : ");
		for(UserData user : arrayList) {
			System.out.println(user.getName() + "  " + user.getRollNumber() +" "+user.getAge());
			 
		}
		
		SortUserDataImplement sortUserDataImplement = new SortUserDataImplement();
		ArrayList<UserData> sortedArrayList = sortUserDataImplement.sortByUserName(arrayList);
		
		
		System.out.println("sort by name : ");
		for(UserData user : sortedArrayList) {
			System.out.println(user.getName() + "  " + user.getRollNumber());
			 
		}
		
	}
		
	}


