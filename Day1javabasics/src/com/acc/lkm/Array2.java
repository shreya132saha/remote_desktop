package com.acc.lkm;
import java.util.Scanner;
public class Array2 {

	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		double total=0, percentage;
		int n;
		System.out.println("Enter the length");
		n=sc.nextInt();
		int x[]=new int[n];
		System.out.println("Enter the marks");
		for(int i=0; i<n; i++)
		{
			x[i]=sc.nextInt();
			total +=x[i];
		}
		System.out.println("Total Marks"+total);
		percentage=(total/n)*100;
		System.out.println(percentage);
	}
}
