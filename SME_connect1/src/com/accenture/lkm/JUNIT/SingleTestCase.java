package com.accenture.lkm.JUNIT;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;

@TestInstance(value = Lifecycle.PER_CLASS)
public class SingleTestCase {

	public SingleTestCase() {
		System.out.println("default constructor");
	}
	@Test
	@DisplayName("Test case to check equality")
	public void testCase1() {
		Assertions.assertEquals(5, 5);
		
	}
	@Test
	public void testCase2() {
		Assertions.assertEquals(8, new Calc().add(4, 4));
		
	}
	@Test
	@DisplayName("Checking boolean value")
	public void testCase3() {
		Assertions.assertTrue(true);
		
	}
	
	
}
