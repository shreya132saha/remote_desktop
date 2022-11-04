package threading;

public class Thread_Synchronization extends Thread {
	void result(int res)
	{
		for(int x=1; x<=3; x++)
		{
			System.out.println(x*(res+1));
			try {
				Thread.sleep(1000);
			}catch(Exception e){
				System.out.println(e);
			}
		}
	}
	
}
