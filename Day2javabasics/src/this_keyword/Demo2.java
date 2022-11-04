//to invoke current class method
package this_keyword;

public class Demo2 {
	void print() {
		System.out.println("print method");
	}
	void display() {
		System.out.println("display method");
	
	this.print();

	}
}
