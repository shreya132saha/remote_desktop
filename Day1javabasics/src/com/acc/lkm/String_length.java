package com.acc.lkm;

public class String_length {

	public static void main(String args[])
	{
		String str=new String("ACCENTURE");
		String str2=new String("placement");
		System.out.println(str.length());
		System.out.println(str.charAt(2));
		System.out.println(str.substring(2,5));
		System.out.println(str.concat(" training"));
		System.out.println(str.endsWith("RE"));
		System.out.println(str.indexOf("C"));
		System.out.println(str.lastIndexOf("T"));
		System.out.println(str.equals(str2));
		System.out.println(str.toLowerCase());
		System.out.println(str2.toUpperCase());
		System.out.println(str.replace("A", "AA"));
		System.out.println(str.trim());
	
	}
}
