
public class First_Class {

	static class A
	{
	
	static class B
	{
		void display() {
			System.out.println("Nested class B");
		}
	
	static class C
	{
		void display() {
			System.out.println("nested class C");
		}
	}
	}
	}
	public static void main(String args[])
	{
		B b=new B();
		b.display();
	}
	
}
