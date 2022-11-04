package Stack;

public class StachMemory {

	public static void main(String args[])
	{
		int x=1; //not used but memory will be allocated
		Object obj=new Object(); //reference of object
		StachMemory stack =new StachMemory(); //instance for my class
		stack.display(obj);
	}
	private void display(Object param)//passing object reference
	{
		String string=param.toString();
		System.out.println(string); //memory allocation
	}
}
