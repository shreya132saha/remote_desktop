package com.acc.lkm;
import java.util.Scanner;

public class Arraydemo {
	public static void main(String args[])
	{
	Scanner sc=new Scanner(System.in);
	int len;
	System.out.println("Enter the length");
	len=sc.nextInt();
	int x[]=new int[len+1];
	for(int i=0; i<len; i++) {
		x[i]=sc.nextInt();
		System.out.println("Enter the elements you want to insert");
		int ele=sc.nextInt();
		x[len]=ele;
		System.out.println("After inserting");
		for( i=0; i<len; i++) {
			System.out.println(x[i]+" ");
		}
		System.out.println(x[len]);
	}

}
}