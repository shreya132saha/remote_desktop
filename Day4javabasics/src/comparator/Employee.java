package comparator;

import java.util.Comparator;

public class Employee implements Comparator<Employee> {

	int EID;
	String name;
	double Salary;

	public Employee(int EID, String name, double Salary) {
		this.EID = EID;
		this.name = name;
		this.Salary = Salary;
	}

	public int getEID() {
		return EID;
	}

	private void setEID(int eID) {
		EID = eID;
	}

	public String getName() {
		return name;
	}

	private void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return Salary;
	}

	private void setSalary(double salary) {
		Salary = salary;
	}

	public int compare(Employee o1, Employee o2) {
		Employee emp1 = (Employee) o1;
		Employee emp2 = (Employee) o2;
		if (emp1.Salary == emp2.Salary) {
			return 0;
		} else if (emp1.Salary > emp2.Salary) {
			return 1;
		} else {
			{
				return -1;
			}
		}
	}

}
