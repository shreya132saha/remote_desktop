package Java8usingInterface;

public class InterfaceDemo {
	public static void main(String args[]) {
		Interfaceanonymous in=new Interfaceanonymous() {
			
			@Override
			public void getCompany() {
				// TODO Auto-generated method stub
				System.out.println("Company is Accenture");
				System.out.println(ProjectId);
			}
		};
		in.getCompany();
	}

}
