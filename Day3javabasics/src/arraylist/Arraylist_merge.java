package arraylist;
import java.util.*;

public class Arraylist_merge {

	public static void main(String args[])
	{
		ArrayList <String>ar=new ArrayList<String>();
		/*LinkedList<String> ar=new Deque() {
		};*/
		ar.add("Ankit");
		ar.add("Sunanda");
		ar.add("Abhijit");
		System.out.println("Array list current is: "+ar);
		ar.add(2, "Archan");
		System.out.println("New list is:"+ar);
		//second array list
		ArrayList<String>ar2=new ArrayList<String>();
		ar2.add("Trainer1");
		ar2.add("Trainer2");
		System.out.println("2nd array list is: "+ar2);
		//merge
		ar.addAll(ar2);
		System.out.println("Updated list is"+ar);
		//remove
		ar.remove(5);
		System.out.println("After removal:"+ar);
		//remove on the basis of specified condition
		ar.removeIf(str->str.contains("Ankit"));
		System.out.println("new updated list:"+ar);
		//clear the whole array
		ar.clear();
		System.out.println(ar);
		
		
		
		
		
		
		
		/*Iterator<String>iterator=ar.iterator(); //iteration of type string
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
		}*/ 
		
	}
}
