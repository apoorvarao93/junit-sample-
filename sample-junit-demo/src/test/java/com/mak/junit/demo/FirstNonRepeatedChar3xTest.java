package com.mak.junit.demo;

import static org.junit.Assert.assertEquals;
import junit.framework.TestCase;

public class FirstNonRepeatedChar3xTest extends TestCase {

	protected static void setUpBeforeClass() throws Exception {
	}

	protected static void tearDownAfterClass() throws Exception {
	}

	protected void setUp() throws Exception {
		super.setUp();
	}

	protected void tearDown() throws Exception {
		super.tearDown();
	}

	public final void testGetFirstNonRepeatedChar() {
		assertEquals('b', new FirstNonRepeatedChar().getFirstNonRepeatedChar("abcda"));
	}


}
