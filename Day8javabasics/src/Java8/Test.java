package Java8;

public class Test {
	public static void main(String args[])
	{
		AnonymousDemo an=new AnonymousDemo() {
			
			@Override
			void getID(int id) {
				// TODO Auto-generated method stub
				System.out.println("ID is: "+id);
				
			}
		};
		an.getID(100);
		an.stream("Java");
	}

}
