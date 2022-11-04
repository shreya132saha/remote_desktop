package threading;

public class Inter_thread {
	public static void main(String args[]) {
	final Employee emp=new Employee();
	new Thread()
	{
		public void run()
		{
			emp.fetch(9000.00);
		}
	}.start();
	new Thread()
	{
		public void run()
		{
			emp.receive(10000);
		}
	}.start();
	
	
	
	}
}
