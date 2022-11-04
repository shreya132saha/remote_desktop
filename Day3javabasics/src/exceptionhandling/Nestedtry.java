package exceptionhandling;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

import javax.swing.text.html.HTMLDocument.HTMLReader.BlockAction;
public class Nestedtry {

	public static void main(String args[])
	{
		Scanner scanner =new Scanner(System.in);
		try{
			//FileReader fileReader=new FileReader("acc.txt");//this file is not created but still want to access it, would give i/o exception
			try {
		
			System.out.println("Enter the number");
			int x=scanner.nextInt();
			int b=x/0;
			System.out.println(x);
		}
		catch(ArithmeticException e)
		{
			System.out.println("Arithmetic exception handled");
		}
			try {
				//String company=scanner.next();
				String company=null; //String company="Accenture";
				System.out.println(company.length());
			}
			catch(NullPointerException e) //catch(ArrayIndexOutOfBoundException e) :case1
			{
				System.out.println("Null handled");
			}
			finally {
				System.out.println("finally BlockAction executed");//executes even if the exception is handled
			}
		}catch(Exception e)
		{
			System.out.println(e);
		}
	}
}
