/**
 * 
 */
package com.sebone.excr.collection.basic.test;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.sebone.excr.collection.basic.SortUserDataImplement;
import com.sebone.excr.collection.basic.UserData;

/**
 * @author Bhawna Rathor
 *
 */
public class SortUserDataImplementByAgeTest {

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		SortUserDataImplement sortUserDataImplement=new SortUserDataImplement();
		UserData userData1=new UserData();
		userData1.setRollNumber(101);
		userData1.setAge(20);
		userData1.setName("A");
		
		UserData userData2=new UserData();
		userData2.setRollNumber(102);
		userData2.setAge(21);
		userData2.setName("b");
		
		UserData userData3=new UserData();
		userData3.setRollNumber(103);
		userData3.setAge(22);
		userData3.setName("c");
		
		UserData userData4=new UserData();
		userData4.setRollNumber(104);
		userData4.setAge(23);
		userData4.setName("d");
		
		UserData userData5=new UserData();
		userData5.setRollNumber(105);
		userData5.setAge(24);
		userData5.setName("e");
		
		ArrayList<UserData>arrayList1=new ArrayList<>();
		arrayList1.add(userData1);
		arrayList1.add(userData2);
		arrayList1.add(userData3);
		arrayList1.add(userData4);
		arrayList1.add(userData5);
		
		ArrayList<UserData>arrayList2=new ArrayList<>();
		arrayList2.add(userData3);
		arrayList2.add(userData5);
		arrayList2.add(userData2);
		arrayList2.add(userData4);
		arrayList2.add(userData1);
		
		assertEquals(arrayList1,sortUserDataImplement.sortByAge(arrayList2));
	}

}
