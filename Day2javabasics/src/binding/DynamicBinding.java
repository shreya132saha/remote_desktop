package binding;

public class DynamicBinding extends Binding {

	public void learning() {
		System.out.println(".NET");
	}
	public static void main(String args[])
	{
		Binding bin=new DynamicBinding(); //reference of parent class and object of subclass
		bin.learning();
		bin.set();
	}
	
}
