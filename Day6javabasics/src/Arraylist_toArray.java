//import java.awt.List;
import java.util.ArrayList;

public class Arraylist_toArray {

	public static void main(String args[]) {
		ArrayList<Integer> list=new ArrayList<Integer>();
		list.add(31);
		list.add(87);
		list.add(98);
		
		Object[] objects=list.toArray();
		System.out.println(objects);
		
	}
}
