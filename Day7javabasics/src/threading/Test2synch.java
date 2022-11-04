package threading;

public class Test2synch extends Thread {
	Thread_Synchronization sync;//class reference
	public Test2synch(Thread_Synchronization sync) 		
	{
		this.sync=sync;
	}
	public void run()
	{
		sync.result(10);
	}

}
