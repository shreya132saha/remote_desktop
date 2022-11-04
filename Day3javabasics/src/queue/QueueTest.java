package queue;

import java.util.LinkedList;
import java.util.Queue;

public class QueueTest {
	public static void main(String args[])
	{
		Queue<Integer> queue=new LinkedList<Integer>();
		for(int i=0; i<5; i++)
		
			queue.add(i);
			System.out.println(queue);
			int removedel=queue.remove();
			System.out.println(queue);
			int head=queue.peek();
			System.out.println(queue.peek());
			int size=queue.size();
			System.out.println(queue.size());
		
	}

}
