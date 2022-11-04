package com.accenture.lkm.JUNIT;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;
@TestInstance(Lifecycle.PER_CLASS)
public class MyCalculatorTest {
	private MyCalculator theCalculator;
	@BeforeAll
	void setUpCalc() {
		System.out.println("Inside set up calc method");
		theCalculator=new MyCalculator();
	}
	@AfterAll
	void tearDownCalc() {
		System.out.println("Inside tearDownCalc() method");
	}
	@Test
	public void testGetSum() {
		System.out.println("Indise test method");
		int a=7, b=10;
		assertEquals(17, theCalculator.getSum(a,b));
	}
	

}
