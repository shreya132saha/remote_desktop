package java_io;
import java.io.*;

import javax.swing.text.AbstractDocument.BranchElement;

public class Buffer_reader {
	public static void main(String args[]) throws IOException {
	BufferedReader bufferedReader=new BufferedReader(new InputStreamReader(System.in) )
	System.out.println("enter details"); 
	System.out.println("enter eid");
	int EID=Integer.parseInt(bufferedReader.read());
	
	
	
	
	
	
	
		FileOutputStream fout=new FileOutputStream("acc3.txt");
		String string="Enter the details: \n EID: 12344 \n Total Marks:78 \n Grade:A \n Stream:JAVA";
		byte b[]=string.getBytes();
		System.out.println(b);
		fout.write(b);
		fout.close();
		FileReader fin=new FileReader("acc3.txt");
		BufferedReader bufferedReader=new BufferedReader(fin );
		int i=0;
		while((i=fin.read())!=-1) {  //as in C we use EOF here we are using -1 to go till the program ends
			System.out.print((char) i);
		}
		fin.close();
			
	}

}
