
public class Palindrome_Main {
	public static void main(String args[]) {
		
		Palindrome p=(X)->{
			int r, sum=0, temp;
		
		//int number;
		temp=X;
		while (X>0) {
			r=X%10;
			sum=(sum*10)+r;
			X=X/10;
		}
		if(temp==sum)    
			 System.out.println("palindrome number ");    
			else    
			 System.out.println("not palindrome");  
			
		};
		p.getNumber(262);
			
			/*@Override
			public void getNumber(int number) {
				// TODO Auto-generated method stub
				int r, sum=0, temp;
				//int number;
				temp=number;
				while (number>0) {
					r=number%10;
					sum=(sum*10)+r;
					number=number/10;
				}
				if(temp==sum)    
					 System.out.println("palindrome number ");    
					else    
					 System.out.println("not palindrome"); 
				
			}
		};
		p.getNumber(131);*/
			
			
	}

}



