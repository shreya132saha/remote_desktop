package inheritance;

public class InterfaceTest {
	public static void main(String args[])
	{
		Multiple_inheritance mi=new Multiple_inheritance();
		Trainer1 trainer1=new Multiple_inheritance();
		mi.get();
		mi.set();
		trainer1.get();
		trainer1.set();
		System.out.println(trainer1.display(7));
		System.out.println(Trainer2.display("Accenture"));
		
		
		
	}

}
