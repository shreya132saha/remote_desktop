package Type_Casting;

public class Casting_Main {

	public static void main(String args[]) {
		//upcasting
		Parent parent=new Child();
		parent.name="Java";
		System.out.println(parent.name);
		parent.display();
		
		//downcasting explicitely
		Child child=(Child)parent;
		child.id=1;
		System.out.println(child.name);
		System.out.println(child.id);
		child.display();
	}
}
