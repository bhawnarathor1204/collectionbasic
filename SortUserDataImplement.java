package com.sebone.excr.collection.basic;

import java.util.ArrayList;
import java.util.Collections;


public class SortUserDataImplement implements SortUserData{

	@Override
	public ArrayList<UserData> sortByUserName(ArrayList<UserData>arrayList1) {
		Collections.sort(arrayList1,new SortingByName());
		return arrayList1;
	}

	@Override
	public ArrayList<UserData> sortByRollNumber(ArrayList<UserData> arrayList2) {
		Collections.sort(arrayList2,new SortingByRollNumber());
		return arrayList2;
	}

	@Override
	public ArrayList<UserData> sortByAge(ArrayList<UserData> arrayList2) {
		Collections.sort(arrayList2,new SortingByAge());
		return arrayList2;
	}


}
