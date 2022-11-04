import java.util.HashMap;
import java.util.LinkedHashMap;

public class LinkedHashMapDemo {

	public static void main(String args[]) {
		LinkedHashMap<Integer, String> hashMap=new LinkedHashMap();
		hashMap.put(100, "Raj");
		hashMap.put(101, "Rai");
		hashMap.put(103, "Rohan");
		for (HashMap.Entry<Integer,String> entry : hashMap.entrySet()) //instance created as entry 
            System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue());
	}
	System.out.println("Keys: "+hashMap.getKeys()) ;
	System.out.println("Values: "+hashMap.getValues());
	//System.out.println
}
