package threading;
public class Employee {

	double Salary;
	String name;
	
	synchronized void fetch(double salary) {
		System.out.println("Fetching Salary");
		
		if(this.Salary<salary)
		{
			System.out.println("Specified salary is less for employee");
			try {
				wait();
			}catch (Exception e) {
				System.out.println(e);
			}
		}
		this.Salary-=salary;
		System.out.println("Salary Withdrawn");
	}
	synchronized void receive(double salary)
	{
		System.out.println("Going to receive salary");
		this.Salary+=salary;
		System.out.println("Salary done.");
		notify();
	}
	
	
}
