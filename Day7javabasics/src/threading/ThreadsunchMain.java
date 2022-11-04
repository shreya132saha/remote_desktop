package threading;

public class ThreadsunchMain {

	public static void main(String args[])
	{
		Thread_Synchronization tS1=new Thread_Synchronization();
		Test2synch t2=new Test2synch(tS1);
		t2.run();
		//t2.run();
	}
}
