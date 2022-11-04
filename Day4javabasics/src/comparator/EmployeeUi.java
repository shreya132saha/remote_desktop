package comparator;

import java.util.*;

public class EmployeeUi {

	public static void main(String args[]) {
		List<Employee> empList = new ArrayList<Employee>();
		empList.add(new Employee(1234, "Shreya", 9113.0));
		empList.add(new Employee(1534, "Subhangi", 9003.0));
		empList.add(new Employee(1534, "Sohini", 8003.0));

		// For comparator
		Collections.sort(empList, new Employee(0, null, 0.0)); // sort the element based on condition
		for (Employee employee : empList) { // class Employee with reference employee and a list where we will store the
											// elements that is emplist
			System.out.println("EID is: " + employee.EID + "\n" + "Name is: " + employee.name + "\n" + "Salary is: "
					+ employee.Salary);
		}

	}

}
