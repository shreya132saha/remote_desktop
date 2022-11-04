 /*A class has an integer data member 'L1' and a method named 'printAcc' 
 to print the value of 'L1'. 
 Its subclass also has an integer data member 'L2' and a method named 'printAcc'
 to print the value of 'L2'. 
 Make an object of the subclass and use it to assign a value to 'L1' and to 'L2'. 
 Now call the method 'printAcc' by this object. */



public class Assignment1 {
	int L1;
	public Assignment1(int L1)
	{
		super();
		this.L1=L1;
	}
	public void printAcc()
	{
		System.out.println(L1);
	}

}
