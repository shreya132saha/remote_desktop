package setDemo;

import java.util.Iterator;
import java.util.NavigableSet;
import java.util.TreeSet;

public class Treesetdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TreeSet<String>accenture=new TreeSet<>();
		accenture.add("BlockChain");
		accenture.add("IOT");
		accenture.add("Metaverse");
		//navigates the set in reverse order(descending order)
		NavigableSet<String>reverse=accenture.descendingSet();
		Iterator<String>iterator=reverse.iterator();
		while(iterator.hasNext())
		{
			System.out.println(iterator.next());
		}
		System.out.println(accenture.pollFirst());
		System.out.println(accenture);
		System.out.println(accenture.pollLast());
		System.out.println(accenture);

	}

}
