package com.acc.lkm;

public class Scope {
	private void display()
	{
		System.out.println("private Scope");
	}

}
class B{
	public static void main(String args[])
	{
		Scope sc=new Scope();
		sc.display();
	}
}
