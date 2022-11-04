package aggregation;

import java.util.Date;

public class Car {
	//initialize variable with constructor
	public Car(String car_name, Date purchase_date)
	{
		super();
		this.car_name=car_name;
		this.purchase_date=purchase_date;
		
	}
	//declare variables
	String car_name;
	Date purchase_date;
	public String getCarName() {
		return car_name;
	}
	private void setCarName(String car_name)
	{
		this.car_name=car_name;
	}
	public Date getPurchaseDate()
	{
		return purchase_date;
	}
	private void setPurchaseDate(Date purchase_date) {
		this.purchase_date=purchase_date;
		
	}

}
