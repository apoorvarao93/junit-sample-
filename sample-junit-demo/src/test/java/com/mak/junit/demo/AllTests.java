package com.mak.junit.demo;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ AnagramCheckTest.class, FirstNonRepeatedCharTest.class })
public class AllTests {

}
