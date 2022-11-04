package java_io;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.security.KeyStore.TrustedCertificateEntry;
import java.util.*;

public class Filewriter {

	public static void main(String args[]) {
	try {
	FileWriter fWriter=new FileWriter("acc4.txt");
	fWriter.write("Welcome to Day6");
	fWriter.close();		
	}
	catch(IOException e) {
		System.out.println(e);
	}
	System.out.println("Success");
	try {
		FileReader fileReader=new FileReader("acc4.txt");
		int i=0;
		while((i=fileReader.read())!=-1) {  //as in C we use EOF here we are using -1 to go till the program ends
			System.out.print((char) i);
		}
		fileReader.close();
	}catch(Exception e)
	{
		System.out.println(e);
	}
	}
	

}

