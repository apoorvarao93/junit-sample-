package com.mak.junit.demo;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class FirstNonRepeatedCharTest {

	static FirstNonRepeatedChar firstNonRepeatedChar;
	
	/*
	 * This method is executed once, before the start of all tests. 
	 * It is used to perform time intensive activities, for example, to connect to a database. 
	 * Methods marked with this annotation need to be defined as static to work with JUnit.
	 */
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		firstNonRepeatedChar = new FirstNonRepeatedChar();
	}

	/*
	 * This method is executed once, after all tests have been finished. It is used to perform clean-up activities, 
	 * for example, to disconnect from a database. 
	 * Methods annotated with this annotation need to be defined as static to work with JUnit.
	 */
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		firstNonRepeatedChar = null;
	}

	/*
	 * This method is executed before each test. 
	 * It is used to prepare the test environment (e.g., read input data, initialize the class).
	 */
	@Before
	public void setUp() throws Exception {
	}

	/*
	 * This method is executed after each test. It is used to cleanup the test environment 
	 * (e.g., delete temporary data, restore defaults).
	 * It can also save memory by cleaning up expensive memory structures.
	 */
	@After
	public void tearDown() throws Exception {
	}

	/*
	 * The @Test annotation identifies a method as a test method.
	 */
	@Test
	public final void testGetFirstNonRepeatedChar() {
		assertEquals('b', firstNonRepeatedChar.getFirstNonRepeatedChar("abcda"));
	}

}
