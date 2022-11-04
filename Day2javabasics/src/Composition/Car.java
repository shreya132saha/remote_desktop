package Composition;

public class Car {

	public Car(String car_name, Engine engine)
	{
		super();
		this.car_name=car_name;
		this.engine=engine;
	}
	String car_name;
	Engine engine;
	private String getCar_name() {
		return car_name;
	}
	private void setCar_name(String car_name) {
		this.car_name = car_name;
	}
	private Engine getEngine() {
		return engine;
	}
	private void setEngine(Engine engine) {
		this.engine = engine;
	}
	public static void main(String args[])
	{
		
		Engine engine1=new Engine(765, "diesel");
		Car car=new Car("BMW", engine1);
		System.out.println("engine power is: "+engine1.getPower()+"\n engine type is: "+engine1.getType());
		System.out.println("Car name is: "+car.getCar_name());
	}
	
	
}
