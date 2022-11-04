package com.accenture.lkm.JUNIT;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.omg.CosNaming.NamingContextExtPackage.AddressHelper;

public class RepeatingDemo {

	@RepeatedTest(value = 5, name="{displayName - repetion{currentRepetition}of {totalRepetitions}")
	@DisplayName("Add two numbers")
	void addTwonumber()
	{
		System.out.println("Repeated tests for adding two numbers");
	}
	
}
