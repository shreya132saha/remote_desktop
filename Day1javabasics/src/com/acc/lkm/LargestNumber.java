package com.acc.lkm;

public class LargestNumber {
	static int largest()
	{
		int i;
		int max=arr[0];
		for(int i=1; i<arr.length; i++)
		{
			max=arr[i];
			return max;
		}
	}
	public static void main(String args[])
	{
		
		System.out.println(largest());
	}

}
