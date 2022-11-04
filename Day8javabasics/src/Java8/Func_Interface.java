package Java8;

@FunctionalInterface
public interface Func_Interface {
	void get(String OB);
	default void name(String name) {
		System.out.println(name);
	}
	static int getId(int id)
	{
		return id;
	}
	

}
