package exceptionhandling;

import java.util.Scanner;

public class ExceptionHandling {

	public static void main(String args[])
	{
		Scanner scanner=new Scanner(System.in);
		try {
			int[] a=new int[5];
			a[6]=100;
			System.out.println(a);

			System.out.println("Enter the name: ");
			//array index out of bound at top
			//case2
						String str=scanner.next();
			int x=Integer.valueOf(str);
			System.out.println(x);
		}
		catch(NumberFormatException e)
		{
			System.out.println("Welcome");
		}//jvm prints the exception
		/*case1: catch(Exception e)
		{
			System.out.println("Welcome");
		}
		catch(NumberFormatException e)
		{
		sysout("Welcome"); number format is not mentioned
		}*/
		//how may catch block will be defined with the exception class
		//once if you define one more time it will give runtime error
		catch (ArrayIndexOutOfBoundsException e) {
			// TODO: handle exception
			System.out.println("Java");
		}
	}
}
