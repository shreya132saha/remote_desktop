package java_io;

import java.io.FileOutputStream;
import java.io.IOException;

public class fileoutput {
	public static void main(String args[]) throws IOException
	{
		try{FileOutputStream fout=new FileOutputStream("acc.txt");
		fout.write(65);
		fout.close();}
		catch(Exception e)
		{
			System.out.println("printed");
		}
	}

}
