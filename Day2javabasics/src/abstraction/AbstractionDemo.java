package abstraction;

import java.util.Date;

public class AbstractionDemo {

	public static void main(String args[]) {
		Department dept=new Project("JAVA");
		System.out.println(dept.delivery_date(new Date()));
		dept.requirement(123);
			
			
			
		
	}
}
