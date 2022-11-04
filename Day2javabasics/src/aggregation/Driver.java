package aggregation;

public class Driver {

	public Driver(String driver_name, Car car)
	{
		super();
		this.driver_name=driver_name;
		this.car=car;
	}
	//aggregation
	String driver_name;
	Car car;
	public String getDriverName() {
		return driver_name;
	}
	private void setDriverName() {
		this.driver_name=driver_name;
	}
	public Car getCar() {
		return car;
	}
	private void setCar(Car car)
	{
		this.car=car;
	}
	
	
	public static void main(String args[])
	{
		//create objects of car class
		Car car=new Car("BMW", new java.util.Date(System.currentTimeMillis()));
		//create objects of driver by passing value to the constructor
		Driver driver=new Driver("Akshay", car);
		System.out.println("Driver Name is: "+driver.getDriverName());
		System.out.println("Car name is: "+car.getCarName()+"\n car purchase date"+car.getPurchaseDate());
		
	}
}
