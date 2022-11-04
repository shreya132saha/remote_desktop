package exception;

public class Stack_overflow {
static int p=0;//instance variable
public static int printno(int m)
{
	p=p+2;
	System.out.println(p);
	return p+printno(p+2);
}
public static void main(String args[])
{
	printno(p);
}

}
