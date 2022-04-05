package com.sebone.excr.collection.basic;

/*class Name :- UserData
 * Objective :- This class store the user data
 * @Author :- Bhawna Rathor
 * @Date :-21/03/2022
 */  
public class UserData {
	public int rollNumber;
	public String name;
	public int age;
	

	// This method set the rollNumber of the user
	public void setRollNumber(int rollNumber) {
		this.rollNumber=rollNumber;
	}

	// This method get the rollNumber of the user
	public int getRollNumber() {
	    return rollNumber;
	}

	// This method set the name of the user
	public void setName(String name) {
		this.name=name;
	}

	// This method get the name of the user
	public String getName() {
	   return name;
	}
	

	// This method set the age of the user
	public void setAge(int age) {
		this.age=age;
	}

	// This method get the age of the user
	public int getAge() {
	   return age;
	}

	/*public UserData(int age,int rollNumber ,String name){
		this.age=age;
		this.rollNumber=rollNumber;
		this.name=name;
	}*/

}
