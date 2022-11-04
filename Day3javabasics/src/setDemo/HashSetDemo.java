package setDemo;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

class HashSetDemo {
	public static void main(String args[]) {
		LinkedHashSet<String> hashSet=new LinkedHashSet<>();//to maintain order
		//LinkedHashSet<String> hashSet=new HashSet<>();//unordered
		//HashMap<2, V>
		hashSet.add("Accenture");
		hashSet.add("Java");
		hashSet.add("Sap");
		hashSet.add("Salesforce");
		hashSet.add("NULL");
		hashSet.add(null);
		//hashSet.add(false);
		 
 

		Iterator<String>iterator=hashSet.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());		
		}
		//System.out.println(accenture.pollFirst());
	}

}
