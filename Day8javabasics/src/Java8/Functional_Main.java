package Java8;

public class Functional_Main implements Func_Interface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Functional_Main fmain=new Functional_Main();
		fmain.get("19sep2022");
		fmain.name("Accenture");
		System.out.println(Func_Interface.getId(123));
		

	}

	@Override
	public void get(String OB) {
		// TODO Auto-generated method stub
		System.out.println("OB is: "+OB);
	}

}
