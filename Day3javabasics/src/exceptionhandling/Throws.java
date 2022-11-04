package exceptionhandling;

import java.io.IOException;
import java.sql.SQLClientInfoException;
import java.util.Scanner;

public class Throws extends Exception {
	public Throws(String msg)
	{
		super(msg);
	}
	static long Access, Assets;
//static long Asset_id,  Access_id;
	static void validation(String ch) throws Throws //declare my own class throws keyword is used
	{
		
		Scanner scan=new Scanner(System.in);
		//String ch;
		System.out.println("Enter the assets details");
		long Assets=scan.nextLong();
		System.out.println("Enter the access details");
		long Access=scan.nextLong();
		System.out.println("enter the status: ");
		ch=scan.next();
		
		if(ch=="Y") {
			details();
			//throw new ArithmeticException("Valid");
			throw new Throws("Valid");
			//System.out.println(Asset_id+"\n"+Access_id);
		}
		else {
			//throw new NullPointerException("Not valid");
			System.out.println("Not Valid");
		}
	}
	static void details()
	{
		System.out.println(Assets+"\n"+Access);
	}
	public static void main(String args[])
	{
		try {
		validation("Y");
		}catch(Exception e)
		{
			System.out.println("Encountered");
		}
	}
}
