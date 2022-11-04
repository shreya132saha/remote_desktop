package inheritance;

public class Overriding {
	public static void main(String args[])
	{
		Sbi sbi=new Sbi();
		Axis axis=new Axis();
		Hdfc hdfc=new Hdfc();
		System.out.println("Rate of interest of Sbi is: "+sbi.roi(7)+"\n"+"Rate of interest of Hdfc is: "+hdfc.roi(8)+"\n"+"Rate of interest of Axis is: "+axis.roi(9)+"\n");
	}

}
