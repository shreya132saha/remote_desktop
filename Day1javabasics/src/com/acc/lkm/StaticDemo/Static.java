package com.acc.lkm.StaticDemo;

public class Static {

	static long EID;
	static String name;
	static String dept="Java";
	static String company="Accenture";
	public Static(long eid, String n)
	{
		this.EID=eid;
		this.name=n;
		System.out.println(EID+"\n"+name+"\n"+dept+"\n"+company);
	}
	static void change() {
		dept="Salesforce";
		System.out.println(EID+"\n"+name+"\n"+dept+"\n"+company);
	}
	static class A{
		void print() {
			System.out.println("Nested");
		}
	}
	static {
		System.out.println("Telecom");
	}
	public static void main(String args[])
	{
		change();
		new Static(1235678, "mark");
		//new Static(1324567, "morgan");
		new Static(1237865, "marrie");
		Static.A as=new Static.A();
		as.print();
	}
}
