package sleep_package;

public class DemoSleep extends Thread {
	public void run()
	{
		for(int x=1; x<5; x++)
		{
			try {
				Thread.sleep(1000);
			}catch(InterruptedException e){
				System.out.println(e);
			}
			System.out.println(x);
		}
	}
	public static void main(String args[])
	{
		DemoSleep t1=new DemoSleep();
		DemoSleep t2=new DemoSleep();
		DemoSleep t3=new DemoSleep();
		t1.start();
		try {
			t1.join(1500);
		}catch(Exception e)
		{
			System.out.println(e);
		}
		//t2.start(); 
		t2.run();
		t3.run();
		//t3.start();
		/*t1.run();
		t2.run();*/
		
	}
	

}
