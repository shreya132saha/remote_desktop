package arraylist;
//import java.nio.file.spi.FileSystemProvider;
import java.util.*;

public class Array_List {

	public static void main(String args[])
	{
		ArrayList <String>ar=new ArrayList<String>();
		ar.add("Ankit");
		ar.add("Sunanda");
		ar.add("Abhijit");
		Iterator<String>iterator=ar.iterator(); //iteration of type string
		//first way of using arraylist by while loop
		while(iterator.hasNext())
		{
			//itr will point to -1 position(index position just before the element)
			System.out.println(iterator.next());
		}
		//second way using for each
		for (String each : ar) //it has created a range from 0 to whatever element we have
		{
			System.out.println(each);
		} 
		
	}
}
