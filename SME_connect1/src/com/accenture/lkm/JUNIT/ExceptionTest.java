package com.accenture.lkm.JUNIT;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ExceptionTest {

	@Test
	void exception_Test() {
		
		//to make throws fail
		Throwable mynewException = Assertions.assertThrows(IllegalArgumentException.class, ()->{
			throw new IllegalArgumentException("a new message");});
		Assertions.assertEquals("a=message", mynewException.getMessage());
		}
	@Test
	void nonExceptionTest() {
		Assertions.assertEquals("a=message", "a new message");
	}
	
}
