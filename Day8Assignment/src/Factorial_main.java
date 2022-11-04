
public class Factorial_main {

	public static void main(String[] args) {
		
		Factorial fmain=(X)-> {
		
			int fact=1;
			for(int i=1; i<X; i++)
			{
				fact=fact*i;
			}
			System.out.println(fact);
		};
		fmain.getFactorial(5);
			
			/*@Override
			public void getFactorial(int n) {
				// TODO Auto-generated method stub
				int fact=1;
				for(int i=1; i<n; i++)
				{
					fact=fact*i;
				}
				System.out.println(fact);
			}
		};*/ 

	}

}
