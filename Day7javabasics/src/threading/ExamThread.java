package threading;

public class ExamThread extends Thread {

	public void run()
	{
		System.out.println("Run!");
	}
	public static void main(String args[]) throws InterruptedException
	{
		Thread examthread=new ExamThread();
		examthread.start();
		System.out.println("Eat!");
		examthread.join();
		System.out.println("Relax!");
	}
}
