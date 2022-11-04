package java_io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Serialization {
	public static void main(String args[]) throws IOException, ClassNotFoundException
	{
		User user=new User(1234, "Shreya", "Kolkata");
		//creating stream and writing object
		FileOutputStream fout=new FileOutputStream("accserialize.txt");
		ObjectOutputStream out=new ObjectOutputStream(fout);
		out.writeObject(user);
		out.flush(); //replace data and remove buffer
		//closing the stream
		out.close();
		System.out.println("success");
		FileInputStream fileInputStream=new FileInputStream("accserialize.txt");
		ObjectInputStream objectInputStream=new ObjectInputStream(fileInputStream);
		int i=0;
		System.out.println(objectInputStream.readObject().toString());
		objectInputStream.close();
	}
}
