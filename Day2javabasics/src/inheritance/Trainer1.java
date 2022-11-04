package inheritance;

public interface Trainer1 {

	void set();
	void get();
	default int display(int n)
	{
		return n*n*n;
	}
}
