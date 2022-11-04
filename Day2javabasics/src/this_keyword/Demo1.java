//this keyword to refer current class instance variable
package this_keyword;

public class Demo1 {
	String name;
	int id;
	public Demo1(String name, int id)
	{		
		this.name=name;
		this.id=id;
	}
	private String getName() {
		return name;
	}
	private void setName(String name) {
		this.name = name;
	}
	private int getId() {
		return id;
	}
	private void setId(int id) {
		this.id = id;
	}
	void display()
	{
		System.out.println(name+" "+id);
	}
	

}
