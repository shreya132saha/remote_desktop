package com.acc.lkm;

public class MethodOverloading {
	public void contact(String name, Long Num1)
	{
		System.out.println("Name is:"+name+"\n"+"Num is:"+Num1);
	}
	public void contact(String name, Long Num1, Long Num2)
	{
		System.out.println("Name is:"+name+"\n"+"Num is:"+Num1+"\n"+"Num is:"+Num2);
	}

}
