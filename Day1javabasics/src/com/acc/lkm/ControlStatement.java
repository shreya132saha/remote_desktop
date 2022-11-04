package com.acc.lkm;
import java.util.Scanner;

public class ControlStatement {
	public static void main(String args[])
	{
	Scanner scan=new Scanner(System.in);
	/*System.out.println("Enter the age");
	int age=scan.nextInt();
	if(age<18)
	{System.out.println("not eligible");
	}
	else {
		System.out.println(" eligible");
	}*/
	System.out.println("Enter the year");
	int yr=scan.nextInt();
	if((yr%4==0)|| (yr%400==0)&& (yr%100!=0))
	{
		System.out.println("LeapYr");
		
	}
	else {
		System.out.println("NotLeapYr");
	}
	}
}
