import java.util.HashMap;
import java.util.Map;

public class Hashmap6 {
	public static void main(String args[])
	{
		HashMap<Integer, String> hashMap=new HashMap<>();
		hashMap.put(100, "Raj");
		hashMap.put(101, "Rai");
		hashMap.put(103, "Rohan");
		System.out.println(hashMap);
		hashMap.put(100, "Rahul");
		System.out.println(hashMap);
	}

}
