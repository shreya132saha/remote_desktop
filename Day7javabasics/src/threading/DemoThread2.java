package threading;

public class DemoThread2 extends Thread {
	public void run()
	{		
		System.out.println("Thread is running");
	}
	public static void main(String args) {
		DemoThread2 t1=new DemoThread2();
		t1.start();
		t1.start();
	}
	
	

}
