import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

import javax.swing.text.html.HTMLDocument.Iterator;
import java
public class Shuffle_ArrayList {

	public static void main(String args[])
	{
		ArrayList<Integer> arrayList=new ArrayList<Integer>();
		arrayList.add(34);
		arrayList.add(21);
		arrayList.add(76);	
		System.out.println("Before shuffling Arraylist:"); 
		
		Iterator<Integer>iterator=arrayList.iterator();
  
        while (iterator.hasNext()) { 
            System.out.print(iterator.next() + " "); 
        } 
  
        System.out.println(""); 
  
        Random r1 = new Random(); 
  
        for (int i = arrayList.size() - 1; i >= 1; i--) { 
        	Collections.swap(arrayList, i, r1.nextInt(i + 1)); 
        } 
  
        System.out.println("After shuffling Arraylist:"); 
        iterator = arrayList.iterator(); 
  
        while (iterator.hasNext()) { 
            System.out.print(iterator.next() + " "); 
        } 
        }
	}
