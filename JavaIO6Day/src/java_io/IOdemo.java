package java_io;

import java.io.*;

public class IOdemo {

	public static void main(String args[]) {
		try {
			FileOutputStream fout = new FileOutputStream("acc.txt");
			String string = "Welcome to Accenture";
			byte b[] = string.getBytes();
			// conversion of string to byte array
			System.out.println();
			fout.write(b); // close through invocation
			fout.close();

		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
		try {
			FileInputStream fin=new FileInputStream("acc.txt");
			int i=0;
			while((i=fin.read())!=-1) {  //as in C we use EOF here we are using -1 to go till the program ends
				System.out.print((char) i);
			}
			fin.close();
		}catch(Exception e)
		{
			System.out.println(e);
		}
		
	}

}
