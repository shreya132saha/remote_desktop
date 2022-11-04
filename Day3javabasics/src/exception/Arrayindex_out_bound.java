package exception;

public class Arrayindex_out_bound {

	public static void  main (String args[]) {
		int a[]=new int[10];
		a[15]=100;
		System.out.println(a[15]);
		
	}
}
