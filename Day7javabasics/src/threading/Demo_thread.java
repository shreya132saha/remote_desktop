package threading;

/*1st way public class Demo_thread extends Thread {
	public void run()
	{
		System.out.println("Welcome to Day7");
	}
	public static void main(String args[])
	{
	
		Demo_thread t1=new Demo_thread();
		t1.run();
	}

}*/

public class Demo_thread implements Runnable{

	public void run()
	{
		System.out.println("Welcome to Day7");
	}
	public static void main(String args[])
	{
	
		Demo_thread t1=new Demo_thread();
		Thread th1=new Thread(t1);
		th1.run();
	}
}

