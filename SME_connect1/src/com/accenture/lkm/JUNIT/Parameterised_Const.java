package com.accenture.lkm.JUNIT;

import static org.junit.Assert.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.EnumSource;
import org.junit.jupiter.params.provider.ValueSource;

public class Parameterised_Const {

	/*@ParameterizedTest
	@ValueSource(ints = {1, 2,4}) //ip directly as a param value
	void intValue(final int num)
	{
		assertEquals(num, 2,"the num is"+num);
	}
	*/
	//EnumSource
	public enum myColors{PINK, GREEN, RED, BLUE}
	@ParameterizedTest
	@EnumSource(myColors.class)
	
	void simple(final myColors colors) {
		assertNotNull(colors);
		System.out.println(colors);
	}
	
	
	
	//CSV FILE
	
	@ParameterizedTest
	@CsvFileSource(resources="file.txt")
	@DisplayName("example of CSV FILE")
	void simpleCSVfile(final String firstName, final String emailId) {
		assertNotNull(firstName);
		assertNotNull(emailId);
		
		System.out.println(firstName+ emailId);
	}
	
	
}
