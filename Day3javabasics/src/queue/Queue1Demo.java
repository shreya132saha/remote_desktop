package queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class Queue1Demo {
	public static void main(String args[])
	{
		BlockingQueue<String>queue=new ArrayBlockingQueue<>(3); //3 is the capacity
		/*System.out.println(queue.offer("Ravi"));
		System.out.println(queue.offer("Shreya"));
		System.out.println(queue.offer("Archan"));
		//System.out.println(queue.offer("Aman"));
		System.out.println(queue);
		System.out.println(queue.add("Ravi"));
		System.out.println(queue.add("Raj"));
		System.out.println(queue.add("Rahul"));
		System.out.println(queue.add("Rohan"));
		System.out.println(queue);*/
		queue.offer("Ravi");
		queue.add("Raj");
		queue.add("Rohan");
		System.out.println(queue);
		/*System.out.println(queue.remove());
		System.out.println(queue.remove());
		System.out.println(queue.remove());
		System.out.println(queue);*/
		
		/*System.out.println(queue.poll());
		System.out.println(queue.poll());
		System.out.println(queue.poll());
		System.out.println(queue);
		System.out.println(queue.poll());
		System.out.println(queue);*/
		
		System.out.println(queue.peek());
		System.out.println(queue.peek());
		System.out.println(queue.peek());
		System.out.println(queue);
		//queue.clear();  check once the output
		System.out.println(queue.peek());
		System.out.println(queue);
		
		

	}

}
