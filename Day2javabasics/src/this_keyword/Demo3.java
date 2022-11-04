/*calling default constructor from parameterised constructor
package this_keyword;

public class Demo3 {
	 Demo3() {//default constructor		
		System.out.println("this constructor");
	}
	Demo3(int x)//parameterized constructor
	{
		this();
		System.out.println(x);
	}
	
	

}*/


//calling parameterized constructor from default constructor
package this_keyword;

public class Demo3 {
	Demo3() {
		this(6);
		System.out.println("Default cons");
	}
	Demo3(int x)
	{
		System.out.println(x);
	}
}