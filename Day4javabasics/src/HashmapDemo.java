import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.SortedSet;

public class HashmapDemo {

	public static void main(String args[]) {
		HashMap<Integer, String> hashMap=new HashMap<>();
		hashMap.put(100, "Raj");
		hashMap.put(101, "Rai");
		hashMap.put(103, "Rohan");
		/*for (HashMap.Entry<Integer,String> entry : hashMap.entrySet()) //instance created as entry 
            System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue());*/
		
		//it will give key value mapping in ascending order 
		//thats why we are using comparing one key with other key
		
		hashMap.entrySet().stream()
		.sorted(HashMap.Entry.comparingByKey())
		.forEach(System.out::println); //it will take all the mapping and store in one area then display line by line
		
		//for reverse order(keys are reversed
		hashMap.entrySet().stream()
		.sorted(HashMap.Entry.comparingByKey(Comparator.reverseOrder()))
		.forEach(System.out::println);
		
		//to remove value
		hashMap.entrySet().stream()
		.sorted(HashMap.Entry.comparingByKey())
		.forEach(System.out::println);
		hashMap.remove(100);
		System.out.println(hashMap);
		
		//replace
		hashMap.entrySet().stream()
		.sorted(HashMap.Entry.comparingByKey())
		.forEach(System.out::println);
		hashMap.replace(101, "Rahul");
		System.out.println(hashMap);
		
	}
}
