package com.acc.lkm;

//import java.util.Scanner;

public class Operator {
	public static void main(String args[]) {
	int a=3,b=4,c=9;
	//arithmetic operator
	System.out.println("addition"+(a+b));
	System.out.println("Subtraction"+(a-b));
	System.out.println("Modulus"+(a%b));
	System.out.println("division"+(a/b));
	System.out.println("pre increment"+(++a));
	System.out.println("post increment"+(a++));
	//relational operator
	if(a!=b)
	{
		System.out.println(a);
	}
	else if(a!=c)
	{
		System.out.println(a);
	}
	else
	{
		System.out.println(b);
	}
	//bitwise XOR, AND
	System.out.println("a^b" +(a^b));
	System.out.println("a&b"+(a&b));
	
	/*int ret;
	ret=!((a<b)&&(a==b)); 
	System.out.println(ret);*/
	
}
}
