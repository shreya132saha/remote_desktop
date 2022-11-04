
package java_io;
import java.io.*;

public class IOdemo2 {
	//data output stream
	public static void main(String args[]) throws IOException
	{
	DataOutputStream dataOut=new DataOutputStream(new FileOutputStream("acc2.txt"));
	dataOut.writeUTF("hello, learning IO");
	System.out.println("success");
	DataInputStream dataInputStream=new DataInputStream(new FileInputStream("acc2.txt"));
	while(dataInputStream.available()>0)
	{
		String d=dataInputStream.readUTF();
		System.out.println(d+" ");
	}
	}
}
