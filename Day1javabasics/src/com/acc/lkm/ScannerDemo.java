package com.acc.lkm;

import java.util.Scanner;

public class ScannerDemo {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the name");
		String name=sc.next();
		
		System.out.println("Enter the EID");
		long eid=sc.nextLong();
		System.out.println("Name is:"+name+"Eid"+eid);
	}
}
