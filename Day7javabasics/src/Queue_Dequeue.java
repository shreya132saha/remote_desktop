import java.util.Deque;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

import javax.sql.rowset.Predicate;

public class Queue_Dequeue {

	public static void main(String args[])
	{
		BlockingQueue<String>queue=new ArrayBlockingQueue<>(3); //3 is the capacity
		System.out.println(queue.add("Ravi"));
		System.out.println(queue.add("Shreya"));
		System.out.println(queue.add("Archan"));
		//System.out.println(queue.offer("Aman"));
		System.out.println(queue);
		System.out.println(queue.remove());
		System.out.println(queue.remove());
		System.out.println(queue.remove());
		System.out.println(queue);
		
		Predicate<String> str=str=="Ravi";
		queue.removeIf(str);
		System.out.println(queue);
	}
}
