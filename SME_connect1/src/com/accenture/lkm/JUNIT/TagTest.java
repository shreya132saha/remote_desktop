package com.accenture.lkm.JUNIT;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

public class TagTest {
	@Test
	@Tag("slow")
	void Test1()
	{
		Assertions.assertEquals(3, 3, "2+1=3");
		System.out.println("I am in test1");
	}

	@Test
	@Tag("fast")
	void Test2()
	{
		Assertions.assertEquals(3, 3, "2+1=3");
		System.out.println("I am in test2");
	}

}
