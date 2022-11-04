package binding;

public class Manager extends Employee{
	
	private int numberOfReporters;
	public Manager(String employee_name, int employee_id, int numberOfReporters)
	{
		super(employee_name, employee_id);
		this.numberOfReporters=numberOfReporters;
	}
	private int getNumberOfReporters() {
		return numberOfReporters;
	}
	private void setNumberOfReporters(int numberOfReporters) {
		this.numberOfReporters = numberOfReporters;
	}
	public void displayDetails() {
		System.out.println("Number of reporters "+this.numberOfReporters);
	}
	public static void main(String args[])
	{
		Employee manager=new Manager("Cooper", 12345, 4);
		manager.displayDetails();
		System.out.println(manager.getEmployee_id());
		System.out.println(manager.getEmployee_name());
	}

}
