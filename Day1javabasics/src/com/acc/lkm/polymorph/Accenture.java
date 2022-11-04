package com.acc.lkm.polymorph;

public class Accenture extends Dynamicpolymorphism{

	void project(String proj_name)
	{
		System.out.println(proj_name);
		
	}
	{
		System.out.println(EID);
		
	}
	public static void main(String args[])
	{
		Dynamicpolymorphism dynamicpolymorphism=new Accenture();
		dynamicpolymorphism.project(1324567);
		Accenture accenture=(Accenture)dynamicpolymorphism;
		accenture.project("Apparel");
		accenture.EID=1324255;
		
	}
}
