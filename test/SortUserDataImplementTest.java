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
import com.sebone.excr.collection.basic.SortingByName;
import com.sebone.excr.collection.basic.SortingExecution;
import com.sebone.excr.collection.basic.UserData;

/**
 * @author Bhawna Rathor
 *
 */
public class SortUserDataImplementTest {

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
		SortUserDataImplement sortUserDataImplement1=new SortUserDataImplement();
		
		UserData userData1=new UserData();
		userData1.setAge(20);
		userData1.setName("anshu");
		userData1.setRollNumber(101);
		
		UserData userData2=new UserData();
		userData2.setAge(21);
		userData2.setName("barbi");
		userData2.setRollNumber(102);
		
		UserData userData3=new UserData();
		userData3.setAge(22);
		userData3.setName("catrina");
		userData3.setRollNumber(103);
		
		UserData userData4=new UserData();
		userData4.setAge(23);
		userData4.setName("doli");
		userData4.setRollNumber(104);
		
		UserData userData5=new UserData();
		userData5.setAge(24);
		userData5.setName("eila");
		userData5.setRollNumber(105);
		
		ArrayList<UserData>arrayList1=new ArrayList<UserData>();
		arrayList1.add(userData1);
		arrayList1.add(userData2);
		arrayList1.add(userData3);
		arrayList1.add(userData4);
		arrayList1.add(userData5);
		
		ArrayList<UserData>arrayList2=new ArrayList<UserData>();
		arrayList2.add(userData2);
		arrayList2.add(userData5);
		arrayList2.add(userData3);
		arrayList2.add(userData4);
		arrayList2.add(userData1);
		
		assertEquals(arrayList1, sortUserDataImplement1.sortByUserName(arrayList2));
		
		
	}

}
