package com.acc.lkm;
import java.util.Scanner;

public class ReverseUsingLoop {
	public static void main(String args[])
	{
		
		Scanner sc=new Scanner(System.in);
		int num,digit, rev=0;
		num=sc.nextInt();
		while(num>0)
		{
			digit=num%10;
			rev=rev*10+digit;
			num/=10;
			
		}System.out.println(rev);
	}

}
