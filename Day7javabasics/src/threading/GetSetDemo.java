package threading;

import java.util.PrimitiveIterator.OfDouble;

public class GetSetDemo extends Thread {
	public void run()
	{
		System.out.println("Thread is running");
	}
	public static void main(String args[])
	{
		GetSetDemo t1=new GetSetDemo();
		GetSetDemo t2=new GetSetDemo();
		GetSetDemo t3=new GetSetDemo();
		System.out.println("Name Of Thread1  "+t1.getName());
		System.out.println("Name Of Thread2"+t2.getName());
		//System.out.println("Name Of Thread3"+t3.getName());
		System.out.println("Id Of Thread1"+t1.getId());
		System.out.println("Id Of Thread2 "+t2.getId());;
		System.out.println(Thread.currentThread().getName()+" "+Thread.currentThread().getId()+" "+Thread.currentThread().getPriority()+" ");
		t1.start();
		t2.start();
		t1.setName("Accenture");
		System.out.println("Name Of Thread1 "+t1.getName());
		
		t1.setPriority(Thread.MAX_PRIORITY);
		t2.setPriority(Thread.MIN_PRIORITY);
		t3.setPriority(Thread.MIN_PRIORITY);
		t1.start();
		t2.start();
		t3.start();
		System.out.println(Thread.currentThread().getPriority());
	}

}
