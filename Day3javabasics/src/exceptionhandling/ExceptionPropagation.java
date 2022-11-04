package exceptionhandling;

public class ExceptionPropagation {

	void training()
	{
		String course=null;
		System.out.println(course.length());
	}
	void participant1() {
		this.training();
	
	}
	void trainer() {
		try {
			participant1();
		}
		catch(Exception e)
		{
			System.out.println("Error handled");
		}
		
	}
	public static void  main(String args[]) {
		ExceptionPropagation exceptionPropagation=new ExceptionPropagation();
		exceptionPropagation.trainer();
		
	}
}
