package Composition;

public class Engine {
	public Engine(int power, String type)
	{
		super();
		this.power=power;
		this.type=type;
	}
	int power;
	String type;
	public int getPower() {
		return power;
	}
	private void setPower(int power)
	{
		this.power=power;
	}
	public String getType() {
		return type;
	}
	private void setType(String type)
	{
		this.type=type;
	}

}
