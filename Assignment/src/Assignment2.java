/*Write a Java method to check whether a string is a valid password.
Password rules:
A password must have at least 6 characters.
A password consists of only letters and digits.
A password must contain at least three digits. */
import java.util.Scanner;
public class Assignment2 {
	public static final int PASSWORD_LENGTH=6;

	public static void main(String[] args) {

	        Scanner sc=new Scanner(System.in);
	        System.out.print("1. A password must have at least six characters.\n"+"2. A password consists of only letters and digits.\n"+
	        "3. A password must contain at least three digits \n"+"Input a password: ");
	        String s=sc.nextLine();
	        if (is_Valid_Password(s)) {
	            System.out.println("Password is valid: "+s);
	        } else {
	            System.out.println("Not a valid password: "+s);
	        }
	    }
	    public static boolean is_Valid_Password(String password) {

	        if(password.length()<PASSWORD_LENGTH) 
	        	return false;
	        int charCount=0;
	        int numCount=0;
	        for (int i=0; i<password.length(); i++) {
	            char ch=password.charAt(i);
	            if (is_Numeric(ch)) 
	            	numCount++;
	            else if (is_Letter(ch))
	            	charCount++;
	            else return false;
	        }
	        return (charCount>=3 && numCount>=3);
	    }
	    public static boolean is_Letter(char ch) {
	        ch = Character.toUpperCase(ch);
	        return (ch>='A' && ch<='Z');
	    }
	    public static boolean is_Numeric(char ch) {

	        return (ch>='0' && ch<='9');
	    }

}
