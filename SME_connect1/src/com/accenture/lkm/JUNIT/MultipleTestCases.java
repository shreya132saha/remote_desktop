package com.accenture.lkm.JUNIT;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;
@TestInstance(value = Lifecycle.PER_CLASS)
public class MultipleTestCases {

	public MultipleTestCases() {
		System.out.println("Test class constructor...");
	}
	
	@Test
	@DisplayName("Test case1")
	public void forstTestCase() {
		Assertions.assertEquals("first", "First", "values are not equal");
	}
	@Test
	@DisplayName("Test Case2")
	public void secTestCase(){
		Assertions.assertNotEquals(2, 1, "Both are equals");
	}
	@Test
	@Disabled   //not a good program as there may be chances where you forgot to enable
	public void ignoredTestCase() {
		System.out.println("Ignored");
	}

	
}
