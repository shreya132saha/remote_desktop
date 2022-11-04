package binding;

public class Employee {
	private String employee_name;
	private int employee_id;

	public String getEmployee_name() {
		return employee_name;
	}
	public void setEmployee_name(String employee_name) {
		this.employee_name = employee_name;
	}
	public int getEmployee_id() {
		return employee_id;
	}
	public void setEmployee_id(int employee_id) {
		this.employee_id = employee_id;
	}
	public Employee(String employee_name, int employee_id)
	{
		this.employee_name=employee_name;
		this.employee_id=employee_id;
	}
	public void displayDetails() {
		System.out.println("Display details");
	}
	
	
	
	
	
}
