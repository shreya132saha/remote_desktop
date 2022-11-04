import java.nio.charset.MalformedInputException;
import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

public class TreeMapDemo {

	public static void main(String args[]) {
	TreeMap<Integer, String>map =new TreeMap<Integer, String>();

	map.put(1, "Java");
	map.put(2,  ".NET");
	map.put(3, "SAP");
	map.put(4, "Salesforce");
	
	/*for(Map.Entry m1:map.entrySet())
	{
		System.out.println(m1.getKey()+" "+m1.getValue());
	}*/
	System.out.println("descending Map: "+map.descendingMap());	
	System.out.println("HeadMap: "+map.headMap(2,true));
	System.out.println("TailMap: "+map.tailMap(2, true));
	System.out.println("Sub map: "+map.subMap(2, false, 3, true));//for key2 its false i.e it is exclusive
	}
}

