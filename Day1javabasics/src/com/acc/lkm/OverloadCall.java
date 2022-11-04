package com.acc.lkm;
import java.util.Scanner;

public class OverloadCall {

	public static void main(String args[])
	{
	Scanner sc=new Scanner(System.in);
	
	System.out.println("Enter the name");
	String name=sc.next();
	System.out.println("Enter the number 1");
	Long num1=sc.nextLong();
	System.out.println("Enter the number2 ");
	Long num2=sc.nextLong();
	MethodOverloading over=new MethodOverloading();
	over.contact(name,num1);
	over.contact(name,num1,num2);
}
}
