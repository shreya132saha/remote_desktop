package abstraction;

import java.util.Date;

public abstract class Department {

	public Department(String department_name)
	{
		System.out.println(department_name);
	}
	void requirement(int proj_id)
	{
		System.out.println(proj_id);
	}
	abstract Date delivery_date(Date date);//abstract method does not have body
}
